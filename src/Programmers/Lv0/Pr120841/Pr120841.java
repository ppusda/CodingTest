package Programmers.Lv0.Pr120841;

import java.util.Arrays;

public class Pr120841 {
    public int solution(int[] dot) {
        int cnt = (int) Arrays.stream(dot).filter(d -> d < 0).count();

        if (cnt == 0) return 1;
        if (cnt == 2) return 3;
        if (cnt == 1) if (dot[0] < 0) return 2;
        return 4;
    }
}
