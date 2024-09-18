package BaekJoon.Silver.Pr1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr1003 {

    private static Integer[][] dp = new Integer[41][2]; // 40보다 작거나 같기 때문에 41, 0과 1의 개수를 기록하기 위한 2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        dp[0][0] = 1; // 0, 0 은 0이 1개
        dp[0][1] = 0; // 0, 1 은 1이 0개
        dp[1][0] = 0; // 1, 0 은 0이 0개
        dp[1][1] = 1; // 1, 1 은 1이 1개

        StringBuilder sb = new StringBuilder();

        while(T > 0){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append('\n');

            T--;
        }
        System.out.println(sb);
    }

    private static Integer[] fibonacci(int N) {
        if(dp[N][0] == null || dp[N][1] == null) { // 값이 없을 경우만 할당
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0]; // 0의 경우는 이전 값의 0의 개수 + 이전의 이전 값의 0의 개수
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1]; // 1의 경우는 이전 값의 1의 개수 + 이전의 이전 값의 1의 개수
        }
        return dp[N];

    }
}
