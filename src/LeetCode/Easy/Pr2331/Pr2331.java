package LeetCode.Easy.Pr2331;

public class Pr2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 1) {
            return true;
        } else if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else if (root.val == 3) {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }

        return false;
    }
}
