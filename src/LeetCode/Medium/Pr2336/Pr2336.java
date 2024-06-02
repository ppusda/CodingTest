package LeetCode.Medium.Pr2336;

import java.util.PriorityQueue;

class SmallestInfiniteSet {
    private final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public SmallestInfiniteSet() {
        for (int i = 1; i <= 1000; i++) {
            this.priorityQueue.add(i);
        }
    }

    public int popSmallest() {
        if (this.priorityQueue.isEmpty()) {
            throw new RuntimeException();
        }

        return this.priorityQueue.poll();
    }

    public void addBack(int num) {
        if (!priorityQueue.contains(num)) {
            priorityQueue.add(num);
        }
    }

}
