package Programmers.Lv0.Pr120829;

public class Pr120829 {
    public int solution(int angle) {
        if (angle == 90) {
            return 2;
        }

        if (angle == 180) {
            return 4;
        }

        if (angle < 90) {
            return 1;
        }

        return 3;
    }
}
