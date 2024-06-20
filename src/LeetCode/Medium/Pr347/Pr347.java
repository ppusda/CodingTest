package LeetCode.Medium.Pr347;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Pr347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        priorityQueue.addAll(hashMap.entrySet());

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = priorityQueue.poll().getKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Pr347().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
