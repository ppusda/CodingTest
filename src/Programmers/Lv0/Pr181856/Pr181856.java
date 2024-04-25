// Programmers: 181856_배열 비교하기
package Programmers.Lv0.Pr181856;

import java.util.Arrays;

public class Pr181856 {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        if (arr1Size != arr2Size) {
            return arr1Size > arr2Size ? 1 : -1;
        }

        int arr1Total = Arrays.stream(arr1).sum();
        int arr2Total = Arrays.stream(arr2).sum();

        if (arr1Total != arr2Total) {
            return arr1Total > arr2Total ? 1 : -1;
        }

        return 0;
    }
}
