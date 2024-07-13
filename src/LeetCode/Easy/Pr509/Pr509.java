package LeetCode.Easy.Pr509;

public class Pr509 {
    private static int[] fibo = new int[31];
    public int fib(int n) {
        if (fibo[n] != 0) return fibo[n];
        if (n == 0 || n == 1) return fibo[n] = n;

        return fib(n-2) + fib(n-1);
    }
}
