package Programmers.Lv1.Pr70128;

import java.util.stream.IntStream;

public class Pr70128_Sol {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
} // stream + lambda로 해결하는 방법
