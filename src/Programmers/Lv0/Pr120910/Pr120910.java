package Programmers.Lv0.Pr120910;

import java.util.stream.IntStream;

public class Pr120910 {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }

    // return (int)Math.pow(2, t) * n; 로도 해결 가능...ㅠㅜ
}