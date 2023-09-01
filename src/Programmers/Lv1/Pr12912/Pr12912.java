package Programmers.Lv1.Pr12912;

public class Pr12912 {
    public long solution(int a, int b) {
        int answer = 0;

        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }
}
