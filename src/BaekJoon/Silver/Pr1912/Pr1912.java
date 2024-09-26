package BaekJoon.Silver.Pr1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1912 {

    private static int N, MAX;
    private static int[] array;
    private static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        array = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0 ; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = array[0]; // 초기 값 세팅
        MAX = array[0];

        dynamic(N-1);

        /***
         * 		for (int i = 1; i < N; i++) { // Bottom - Up 방식
         * 			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]); // 점화식 적용
         * 			max = Math.max(max, dp[i]); // 최댓값 갱신
         *      }
         */

        System.out.println(MAX);
    }

    private static int dynamic(int index) {
        if (dp[index] == null) {
            dp[index] = Math.max(dynamic(index-1) + array[index], array[index]); // 연속된 수의 합이 자기 자신 보다 더 크다면 dp[]에 기록
            MAX = Math.max(MAX, dp[index]); // 그 중 큰 값이 있었다면 MAX에 저장
        }

        return dp[index];
    }
}
