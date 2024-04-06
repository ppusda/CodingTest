// Programmers: 181839_주사위 게임 1
package Programmers.Lv0.Pr181839;

public class Pr181839 {
    public int solution(int a, int b) {
        if (a % 2 != 0 && b % 2 != 0) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        }

        if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        }

        return Math.abs(a - b);
    }
}
