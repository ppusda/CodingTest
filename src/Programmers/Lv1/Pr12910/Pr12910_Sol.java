package Programmers.Lv1.Pr12910;

import java.util.Arrays;

public class Pr12910_Sol {
    public int[] divisible(int[] array, int divisor) {
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}
