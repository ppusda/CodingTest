package LeetCode.Medium.Pr1845;

import java.util.PriorityQueue;

public class Pr1845 {
    private PriorityQueue<Integer> queue;

    public Pr1845(int n) {
        queue = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
    }

    public int reserve() {
        return (!queue.isEmpty())? queue.poll() : -1;
    }

    public void unreserve(int seatNumber) {
        queue.offer(seatNumber);
    }
}
