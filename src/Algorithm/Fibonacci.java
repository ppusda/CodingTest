package Algorithm;

public class Fibonacci {

    private static int[] fibo;

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        fibo[1] = 1;
        fibo[2] = 1;


        // fibonacciRecursion(n);
        fibonacciLoop(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i]);
        }
    }

    private static int fibonacciRecursion(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        return fibo[n] = fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

    private static void fibonacciLoop(int n) {
        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }
}
