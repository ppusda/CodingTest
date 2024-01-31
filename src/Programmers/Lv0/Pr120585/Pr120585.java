package Programmers.Lv0.Pr120585;

import java.util.Arrays;

public class Pr120585 {
    public int solution(int[] array, int height) {
        Arrays.sort(array);

        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer = i;
                return array.length - answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr120585().solution(new int[]{149, 180, 192, 170}, 167));
    }
}
