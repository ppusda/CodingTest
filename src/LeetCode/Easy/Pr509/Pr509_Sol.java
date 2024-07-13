package LeetCode.Easy.Pr509;

public class Pr509_Sol {
    private static int[] fibo = new int[31];
    public int fib(int n) {
        if (n <= 1) return n;

        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibo[n] = fibo[n-1] + fibo[n-2];
        }

        return fibo[n];
    }
}
