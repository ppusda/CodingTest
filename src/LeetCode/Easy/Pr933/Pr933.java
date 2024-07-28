package LeetCode.Easy.Pr933;

import java.util.LinkedList;
import java.util.Queue;

public class Pr933 {
    Queue<Integer> queue;
    public Pr933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t-3000) {
            queue.poll();
        }
        return queue.size();
    }
}
