// Programmers: 120845_주사위의 개수
package Programmers.Lv0.Pr120845;

public class Pr120845 {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int size: box) {
            answer *= size/n;
        }

        return answer;
    }
}
