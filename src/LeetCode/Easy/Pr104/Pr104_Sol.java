package LeetCode.Easy.Pr104;

import java.util.LinkedList;
import java.util.Queue;

public class Pr104_Sol {
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
