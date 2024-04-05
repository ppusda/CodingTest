// Programmers: 181901_배열 만들기 1
package Programmers.Lv0.Pr181901;

public class Pr181901 {
    public int[] solution(int n, int k) {
        int cnt = 0;
        int length = n/k;
        int[] answer = new int[length];
        for(int i = 1; i <= length; i++) {
            answer[cnt++] = k * i;
        }

        return answer;
    }
}
