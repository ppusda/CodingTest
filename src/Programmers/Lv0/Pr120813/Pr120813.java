package Programmers.Lv0.Pr120813;

import java.util.stream.IntStream;

public class Pr120813 {
    public int[] solution(int n) {
        return IntStream.range(0, n+1).filter(x -> x%2 != 0).toArray();
    }
}
