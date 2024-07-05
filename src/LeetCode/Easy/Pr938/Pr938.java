package LeetCode.Easy.Pr938;

import java.util.LinkedList;
import java.util.Queue;

public class Pr938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int answer = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if (low <= node.val &&  node.val <= high) {
                    answer += node.val;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return answer;
    }

}
