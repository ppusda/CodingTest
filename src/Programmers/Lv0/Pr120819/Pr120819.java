package Programmers.Lv0.Pr120819;

public class Pr120819 {
    public int[] solution(int money) {
        int count = 0;
        while (money >= 5500) {
            money -= 5500;
            count++;
        }

        return new int[] {count, money};
    }
}