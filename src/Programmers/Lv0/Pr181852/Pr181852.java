package Programmers.Lv0.Pr181852;

import java.util.Arrays;

public class Pr181852 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);

        int index = 0;
        for (int i = 5; i < num_list.length; i++) {
            answer[index] = num_list[i];
            index ++;
        }

        return answer;
    }
}
