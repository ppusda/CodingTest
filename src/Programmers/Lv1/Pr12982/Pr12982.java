package Programmers.Lv1.Pr12982;

import java.util.Arrays;

public class Pr12982 {
    public int solution(int[] d, int budget) {
        int answer = budget;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
            answer -= d[i];
            if(answer < 0) {
                return i;
            } else if (answer == 0) {
                return i+1;
            }
        }

        return d.length;
    }
}
