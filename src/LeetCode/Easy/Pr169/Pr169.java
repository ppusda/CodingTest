package LeetCode.Easy.Pr169;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Pr169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
                (n, m) -> m.getValue() - n.getValue()
        );
        priorityQueue.addAll(map.entrySet());

        return priorityQueue.poll().getKey();
    }
}
