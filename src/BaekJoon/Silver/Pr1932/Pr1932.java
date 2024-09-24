package BaekJoon.Silver.Pr1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1932 {

    private static int N;
    private static int[][] array;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        array = new int[N][N];
        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i+1; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) { // 초기 값 설정
            dp[N-1][i] = array[N-1][i];
        }

        System.out.println(dynamic(0, 0));
    }

    private static int dynamic(int index, int route) {
        if (index >= N || route >= N) return 0; // 오류 방지

        if (dp[index][route] == 0) {
            dp[index][route] = Math.max(dynamic(index+1, route), dynamic(index+1, route+1)) + array[index][route];
        }

        return dp[index][route];
    }
}
