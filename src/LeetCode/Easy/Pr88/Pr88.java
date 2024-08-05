package LeetCode.Easy.Pr88;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Pr88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        for (int num : nums1) {
            if (count < n) {
                if (num != 0) {
                    pq.add(num);
                    continue;
                }
            }else {
                pq.add(num);
            }
            count ++;
        }

        for (int num : nums2) {
            pq.add(num);
        }

        int index = 0;
        while (!pq.isEmpty()) {
            nums1[index++] = pq.poll();
        }
    }


}
