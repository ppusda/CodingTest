// Programmers: 181835_조건에 맞게 수열 변환하기 3
package Programmers.Lv0.Pr181835;

import java.util.Arrays;

public class Pr181835 {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            return Arrays.stream(arr).map(n -> n + k).toArray();
        }

        return Arrays.stream(arr).map(n -> n * k).toArray();
    }
}
