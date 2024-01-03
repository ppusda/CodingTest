package Programmers.Lv0.Pr120817;

import java.util.Arrays;

public class Pr120817 {
    public double solution(int[] numbers) {
        return (double) Arrays.stream(numbers).sum() / numbers.length;
    }
}

//    public double solution(int[] numbers) {
//        return Arrays.stream(numbers).average().orElse(0);
//    } average도 있음...