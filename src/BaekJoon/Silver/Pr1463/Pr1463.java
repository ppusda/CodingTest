package BaekJoon.Silver.Pr1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr1463 {

    private static int X;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());

        dp = new int[X+1];

        for (int i = 2; i <= X; i++) {
            dp[i] = dp[i-1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2]+1); // 1을 뺀값과 2로 나눈값준 최솟값
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3]+1); // (1을 뺀 값과 2로 나눈 값중 최솟값) 과 3으로 나눈값중 최솟값
            }
        }

        System.out.println(dp[X]);
    }
}
