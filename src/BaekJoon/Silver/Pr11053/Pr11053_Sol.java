package BaekJoon.Silver.Pr11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr11053_Sol {

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

        for(int i = 0; i < N; i++) { // 0 ~ i 이전 원소들 탐색
            dp[i] = 1;
            for(int j = 0; j < i; j++) { // j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우
                if(array[j] < array[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;	// j번째 원소의 +1 값이 i번째 dp가 된다.
                }
            }
        }

        // 최댓값(최대 길이) 탐색
        int max = -1;
        for(int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);
    }
}
