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

        // Bottom-Up 방식
        for (int i = 2; i <= X; i++) { // 0과 1은 연산 범위에 포함되지 않으므로 제외
            dp[i] = dp[i-1] + 1; // 이전 값에서 1 뺀 값을 반대로 생각하여 1을 더해준다.
            if (i % 2 == 0) { // 만약 2로 나누어 떨어질 때
                dp[i] = Math.min(dp[i], dp[i/2]+1); // 1을 더해준 값 (기본 값)과 2로 나눈 값 중 최솟값으로 갱신한다.
            }
            if (i % 3 == 0) { // 만약 3으로 나누어 떨어질 때
                dp[i] = Math.min(dp[i], dp[i/3]+1); // dp[i]에 기록된 값 과 3으로 나눈 값 중 최솟값으로 갱신한다.
            }
        }

        System.out.println(dp[X]);
    }
}
