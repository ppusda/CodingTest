package Programmers.Lv0.Pr120889;

import java.util.Arrays;

public class Pr120889 {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            return 1;
        }

        return 2;
    }
}
