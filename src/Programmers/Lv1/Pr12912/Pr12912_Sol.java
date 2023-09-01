package Programmers.Lv1.Pr12912;

public class Pr12912_Sol {
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}

// (b - a + 1) * (a + b)
