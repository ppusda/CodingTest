// Programmers: 68644_두 개 뽑아서 더하기
package Programmers.Lv1.Pr68644;

import java.util.Set;
import java.util.TreeSet;

public class Pr68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
