package Programmers.Lv0.Pr120847;

import java.util.Arrays;

public class Pr120847 {
    public int solution(int[] numbers) {
        int lastIndex = numbers.length-1;
        numbers = Arrays.stream(numbers).sorted().toArray(); // Arrays.sort(numbers)도 됨

        return numbers[lastIndex] * numbers[lastIndex-1];
    }
}
