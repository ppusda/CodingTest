package Programmers.Lv0.Pr181891;

import java.util.stream.IntStream;

public class Pr181891_Sol {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }
}
