package Programmers.Lv0.Pr120905;

import java.util.Arrays;

public class Pr120905 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }
}
