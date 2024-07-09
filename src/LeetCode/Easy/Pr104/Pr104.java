package LeetCode.Easy.Pr104;

import java.util.LinkedList;
import java.util.Queue;

public class Pr104 {
    public int maxDepth(TreeNode root) {
        int level = 0;
        if (root == null) {
            return level;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node =  queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            level ++;
        }

        return level;
    }
}
