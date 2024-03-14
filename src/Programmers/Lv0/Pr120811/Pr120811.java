package Programmers.Lv0.Pr120811;

import java.util.Arrays;

public class Pr120811 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
