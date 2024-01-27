package Programmers.Lv0.Pr120821;

import java.util.Arrays;
import java.util.Collections;

public class Pr120821 {
    public int[] solution(int[] num_list) {
        int start = 0;
        int end = num_list.length - 1;
        int tryCount = num_list.length / 3;

        for (int i = 0; i <= tryCount; i++) {
            int tmp = num_list[start];
            num_list[start] = num_list[end];
            num_list[end] = tmp;

            start++;
            end--;
        }

        return num_list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Pr120821().solution(new int[]{1, 2, 3, 4, 5})));
    }
}

/**
 * 외의 방법
 * 1. 새 배열 생성하여 num_list.length 부터 0까지 차례대로 넣기
 *
 *     public int[] solution(int[] num_list) {
 *         int[] answer = new int[num_list.length];
 *         for(int i = 0; i< num_list.length; i++){
 *             answer[i] = num_list[num_list.length-i-1];
 *         }
 *         return answer;
 *     }
 *
 *
 * 2. IntStream 사용
 *
 *     public int[] solution(int[] num_list) {
 *         return IntStream.range(1, num_list.length + 1)
 *                 .map(i -> numList[num_list.length - i])
 *                 .toArray();
 *     }
 */