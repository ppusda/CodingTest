package Programmers.Lv0.Pr181899;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Pr181899 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];

        int index = 0;
        for (int i = start; i >= end_num; i--) {
            answer[index] = i;
            index ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr181899 pr181899 = new Pr181899();
        System.out.println(Arrays.toString(pr181899.solution(10, 3)));
    }
}
