package LeetCode.Medium.Pr2415;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pr2415 {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            List<TreeNode> nodeList = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                nodeList.add(node);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (level%2 != 0) {
                int left = 0;
                int right = nodeList.size()-1;
                while (left < right) {
                    int temp = nodeList.get(left).val;
                    nodeList.get(left).val = nodeList.get(right).val;
                    nodeList.get(right).val = temp;
                    left ++;
                    right --;
                }
            }

            level ++;
        }

        return root;
    }
}
