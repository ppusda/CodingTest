package BaekJoon.Silver.Pr11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr11726 {

    private static int N;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];

        dp[0] = dp[1] = 1; // 점화식을 살펴 본 결과 n = (n-1) + (n-2)임을 확인함. (피보나치)
        recursion(N);
        System.out.println(dp[N]);
    }

    private static int recursion(int index) {
        if (dp[index] != 0) return dp[index];
        return dp[index] = (recursion(index-1) + recursion(index-2)) % 10007;
        // 10007을 나눈 결과를 출력해야 함, 출력 시점에 하지 않는 이유는 N이 1000까지 가능하기 때문에 int의 범위를 벗어나기 때문
    }
}
