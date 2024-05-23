package Programmers.Lv0.Pr181884;

public class Pr181884 {
    public int solution(int[] numbers, int n) {
        int total = 0;
        for (int i : numbers) {
            total += i;
            if (total > n) {
                break;
            }
        }
        return total;
    }
}
