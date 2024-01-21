package Programmers.Lv0.Pr120831;

public class Pr120831 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
