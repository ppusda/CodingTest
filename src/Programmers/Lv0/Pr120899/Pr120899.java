// Programmers: 120899_가장 큰 수 찾기
package Programmers.Lv0.Pr120899;

public class Pr120899 {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
}
