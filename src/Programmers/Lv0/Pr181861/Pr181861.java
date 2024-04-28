// Programmers: 181861_배열의 원소만큼 추가하기
package Programmers.Lv0.Pr181861;

import java.util.Arrays;

public class Pr181861 {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];

        int index = 0;
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                answer[index++] = a;
            }
        }

        return answer;
    }
}
