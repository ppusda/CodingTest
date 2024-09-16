package BaekJoon.Silver.Pr9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr9095 {
    private static int T;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i <= 10; i++) { // 4부터 시작
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1]; // 점화식
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
