package BaekJoon.Silver.Pr11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr11399 {

    private static int[] array, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        array = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        dp[0] = array[0];
        for (int i = 1; i < N; i++) {
            dp[i] = dp[i-1] + array[i];
        }


        System.out.println(Arrays.stream(dp).sum());
        br.close();
    }
}
