package Programmers.Lv0.Pr181852;

import java.util.Arrays;

public class Pr181852_Sol {
    public int[] solution(int[] numList) {
        return Arrays.stream(numList).sorted().skip(5).toArray();
    }
}
