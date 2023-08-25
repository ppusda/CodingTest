package Programmers.Lv1.Pr12954;

public class Pr12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long add = 0;

        for(int i = 0; i < n; i++) {
            add += x;
            answer[i] = add;
        }

        return answer;
    }
}
