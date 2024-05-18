package Programmers.Lv0;

import java.util.Arrays;

public class Pr181879 {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            return Arrays.stream(num_list).sum();
        }

        int answer = 1;
        for (int num: num_list) {
            answer *= num;
        }

        return answer;
    }
}
