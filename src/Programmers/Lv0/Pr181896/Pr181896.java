package Programmers.Lv0.Pr181896;

import java.util.Arrays;

public class Pr181896 {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length - 1; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    // return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
}
