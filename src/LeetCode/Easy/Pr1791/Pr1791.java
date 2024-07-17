package LeetCode.Easy.Pr1791;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Pr1791 {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int[] edge : edges) {
            for (int node : edge) {
                hashMap.put(node, hashMap.getOrDefault(node, 0)+1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (o1, o2) -> o2.getValue() - o1.getValue()
        );
        pq.addAll(hashMap.entrySet());

        return pq.poll().getKey();
    }
}
