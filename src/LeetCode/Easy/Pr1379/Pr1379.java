package LeetCode.Easy.Pr1379;

public class Pr1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original.val == target.val)  {
            return cloned;
        }

        TreeNode left = getTargetCopy(original.left, cloned.left, target);

        if (left != null) {
            return left;
        }

        return getTargetCopy(original.right, cloned.right, target);
    }
}
