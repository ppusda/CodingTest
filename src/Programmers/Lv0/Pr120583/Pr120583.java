package Programmers.Lv0.Pr120583;

import java.util.Arrays;

public class Pr120583 {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(x -> x == n).count();
    }
}
