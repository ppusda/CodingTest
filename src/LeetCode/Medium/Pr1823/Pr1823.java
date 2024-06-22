package LeetCode.Medium.Pr1823;

import java.util.LinkedList;
import java.util.Queue;

public class Pr1823 {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 1;
        while (queue.size() > 1) {
            if (count == k) {
                queue.poll();
                count = 1;
            }

            if (count < k) {
                queue.add(queue.poll());
                count ++;
            }
        }

        if (queue.isEmpty()) {
            return 0;
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        System.out.println(new Pr1823().findTheWinner(6, 5));
    }
}
