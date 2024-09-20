package BaekJoon.Bronze.Pr2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2775 {

    private static int[][] dp;
    private static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        dp = new int[15][15];
        for (int i = 1; i < 15; i++) { // 초기값 세팅
            dp[0][i] = i;
        }

        for (int i = 1; i <= 14; i++){
            for (int j = 1; j <= 14; j++) {
                dynamic(i, j);
            }
        }


        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            System.out.println(dp[K][N]);
        }
    }

    private static int dynamic(int level, int index) {
        if (dp[level][index] != 0) return dp[level][index];
        int value = 0;
        for (int i = 1; i <= index; i++) {
            value += dp[level-1][i];
        }
        return dp[level][index] = value;
    }
}
