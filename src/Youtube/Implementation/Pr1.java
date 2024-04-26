package Youtube.Implementation;

import java.util.Arrays;

public class Pr1 {
    public int solution(int n) {
        int result = 0;

        int hour = 0;
        int minute = 0;
        int second = 0;

        while (hour <= n) {
            if (String.valueOf(hour).contains("3") ||
                    String.valueOf(minute).contains("3") ||
                    String.valueOf(second).contains("3")) {
                result++;
            }

            second++;

            if (second == 60) {
                second = 0;
                minute++;
            }

            if (minute == 60) {
                minute = 0;
                hour++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1().solution(5));
    }
}

// 구현은 보통 Brute force와 같은 완전탐색, 시뮬레이션 문제가 많다.

/*
 *for (int i = 0; i <= h; i++) {
    for (int j = 0; j < 60; j++) {
        for (int k = 0; k < 60; k++) {
            // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
            if (check(i, j, k)) cnt++;
        }
    }
}
 */

// https://www.youtube.com/watch?v=2zjoKjt97vQ