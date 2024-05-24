package Programmers.Lv2.Pr42626;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pr42626_Sol {
    public int solution(int[] scoville, int K) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int sc : scoville) {
            heap.add(sc);
        }

        if (heap.peek() >= K) {
            return 0;
        }

        int count = 0;
        while (heap.size() >= 2) {
            if (heap.peek() >= K) {
                return count;
            }

            int leastScoville = heap.poll();
            int lessScoville = heap.poll();

            heap.add(leastScoville + (lessScoville * 2));
            count++;
        }

        if (heap.peek() >= K) {
            return count;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42626_Sol().solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
    }
}

// priorityQueue, heap을 사용하여 해결함.
// 다만, 중복 코드가 보이지 않는가?
