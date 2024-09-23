package BaekJoon.Silver.Pr11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr11053 {

    private static int N;
    private static int[] array;
    private static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dp = new Integer[N];
        array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) { // 0 ~ N-1까지 count 개수를 탐색해야 함.
            dynamic(i);
        }

        int max = dp[0];
        for(int i = 1; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    private static int dynamic(int index) {
        if (dp[index] == null) {
            dp[index] = 1;

            for (int i = index-1; i >= 0; i--) {
                if(array[i] < array[index]) { // 현재 값 보다 작은 경우에만
                    dp[index] = Math.max(dp[index], dynamic(i)+1); // 적은 값을 더했을 때의 count가 큰 쪽을 선택
                }
            }
        }

        return dp[index];
    }
}
