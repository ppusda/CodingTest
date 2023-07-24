package Programmers.Pr42587;

import java.util.Collections;
import java.util.PriorityQueue;

public class Pr42587 {
    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // 내림차순으로 정렬

        for(int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        } // 우선순위가 높은 문서대로 우선순위 큐에 저장 // 저장 시 자동으로 분류 됨

        boolean flag = false;
        int count = 0;

        while (flag != true) {
            for(int i = 0; i < priorities.length; i++) {
                if(pq.peek() == priorities[i]) {
                    pq.poll();
                    count++;
                    if(i == location) {
                        flag = true;
                        break;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
    }
}

// 참고 - https://kyeahen.github.io/algorithm/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-42587-%ED%94%84%EB%A6%B0%ED%84%B0/