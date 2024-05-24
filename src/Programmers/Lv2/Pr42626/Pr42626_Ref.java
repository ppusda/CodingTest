package Programmers.Lv2.Pr42626;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pr42626_Ref {
    public int solution(int[] scoville, int K) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int sc : scoville) {
            heap.add(sc);
        }

        if (heap.peek() >= K) {
            return 0;
        }

        int count = 0;
        while (heap.size() > 1 && heap.peek() < K) {
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
        System.out.println(new Pr42626_Ref().solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
    }
}

// 중복 코드를 줄이기 위해 while문의 조건을 추가하고, 바깥에서 한 번에 return 하도록 처리하였다.
// 이 경우 삼항연산자보다 가독성이 나은 early-return 방식을 적용하였다.