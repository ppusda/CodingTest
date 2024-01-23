package Programmers.Lv0.Pr181899;

import java.util.stream.IntStream;
public class Pr181899_Sol {

    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
}
