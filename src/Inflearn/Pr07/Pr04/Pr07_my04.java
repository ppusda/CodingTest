package Inflearn.Pr07.Pr04;

public class Pr07_my04 {

    private static int[] fibo;

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];

        fibo[1] = 1;
        fibo[2] = 1;

        fibonacci(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    private static void fibonacci(int n) {
        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

} // 피보나치 재귀 for문으로 풀어보기
