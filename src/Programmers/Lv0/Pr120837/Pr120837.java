// Programmers: 120837_개미 군단
package Programmers.Lv0.Pr120837;

public class Pr120837 {
    public int solution(int hp) {
        int[] ants = new int[]{5, 3, 1};
        int answer = 0;
        for (int ant : ants) {
            int attack = hp / ant;
            answer += attack;
            hp = hp % ant;
        }

        return answer;
    }
}
