// LeetCode: 1302_Deepest-leaves-sum
package LeetCode.Medium.Pr1302;

import java.util.LinkedList;
import java.util.Queue;

public class Pr1302 {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int answer = 0;
        while (!queue.isEmpty()) {
            int levelSum = 0;
            for (int i = 0; i < queue.size(); i++) {
                TreeNode treeNode = queue.poll();
                levelSum += treeNode.val;
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            answer = levelSum;
        }

        return answer;
    }

}
