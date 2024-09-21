package BaekJoon.Silver.Pr2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2579 {

    private static int N;
    private static Integer[] dp;
    private static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        array = new int[N+1];
        dp = new Integer[N+1];

        for (int i = 1; i <= N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = array[0];
        dp[1] = array[1];
        if (N >= 2) {
            dp[2] = array[1] + array[2];
        }
        // 초기 값 세팅, 탑 다운 방식의 경우 재귀로 풀어나가기 때문, N이 1일 경우를 대비해 예외처리

        dynamic(N);
        System.out.println(dp[N]);
        br.close();
    }

    private static int dynamic(int index) {
        if (dp[index] == null) {
            dp[index] = Math.max(dynamic(index-2), dynamic(index-3) + array[index-1]) + array[index];
        }

        return dp[index];
    }
}

/***
 * 		for (int i = 3; i <= N; i++) {
 * 			DP[i] = Math.max(DP[i - 2] , DP[i - 3] + arr[i - 1]) + arr[i];
 *      }
 *      // 바텀 업
 */