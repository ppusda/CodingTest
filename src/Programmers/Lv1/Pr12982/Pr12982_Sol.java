package Programmers.Lv1.Pr12982;

import java.util.Arrays;

public class Pr12982_Sol {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) break;

            answer++;
        }

        return answer;
    }

    // 카운팅 방식이 더 유리했던 것 같다.
}
