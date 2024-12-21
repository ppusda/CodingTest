package BaekJoon.Gold.Pr12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr12865 {

    static Integer[][] dp;
    static int[] W;
    static int[] V;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        W = new int[N];
        V = new int[N];

        dp = new Integer[N][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(N - 1, K));

    }

    static int knapsack(int i, int k) { // 무게, 목표 가중치
        if (i < 0) return 0;

        if (dp[i][k] == null) { // 탐색하지 않았다면
            if(W[i] > k) { // 현재 물건의 무게가 목표 가중치 보다 크다면
                dp[i][k] = knapsack(i - 1, k); // 이전 값의 가중치를 할당
            }
            else { // 현재 물건을 담을 수 있는 경우
                dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]); // 이전 값의 가중치와 이전 값 가중치 + 현재 값 가중치 중 더 큰 수 할당
            }
        }
        return dp[i][k];
    }
}
