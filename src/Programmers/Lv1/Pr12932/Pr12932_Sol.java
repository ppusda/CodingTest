package Programmers.Lv1.Pr12932;

public class Pr12932_Sol {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
