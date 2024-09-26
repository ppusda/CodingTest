package BaekJoon.Silver.Pr9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr9461 {

    private static int T;
    private static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        dp = new Long[101]; // 100 까지 가능하기에 101로 초기화
        dp[1] = dp[2] = dp[3] = 1L;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dynamic(n));
        }
    }

    private static Long dynamic(int index) {
        if (dp[index] == null) {
            return dp[index] = dynamic(index-3) + dynamic(index-2);
        }

        return dp[index];
    }
}

// 100 까지가면 숫자가 int 범위를 벗어나느 일이 발생함