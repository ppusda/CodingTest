package LeetCode.Easy.Pr2974;

import java.util.PriorityQueue;

public class Pr2974_Sol {
    public int[] numberGame(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] res = new int[nums.length];
        for (int num : nums) {
            queue.add(num);
        }
        int idx = 0;
        while (!queue.isEmpty()) {
            int alice = queue.poll();
            if (queue.isEmpty()) break;
            res[idx++] = queue.poll();
            res[idx++] = alice;
        }
        return res;
    }
}
