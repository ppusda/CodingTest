package LeetCode.Easy.Pr2331;

public class Pr2331_Sol {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        }
        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);
        if (root.val == 2) {
            return leftVal || rightVal;
        }
        return leftVal && rightVal;
    }
}
