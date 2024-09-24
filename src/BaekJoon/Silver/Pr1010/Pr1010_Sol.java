package BaekJoon.Silver.Pr1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1010_Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] dp = new int[30][30];

        // 2번 성질, (n == r, r == 0) 일 때는 1
        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }


        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                // 1번 성질, 파스칼의 법칙
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
            int N = Integer.parseInt(st.nextToken());	// N = r
            int M = Integer.parseInt(st.nextToken());	// M = n

            sb.append(dp[M][N]).append('\n');
        }

        System.out.println(sb);

    }
}

// n+1 C r+1 = n C r + n C r+1
// n C r = n-1 C r-1 + n-1 C r 과 같다.
// 이는 파스칼의 법칙을 이용한 부분이며, 위의 함수에 적용하여 dynamic(left-1, right-1) + dynamic(left-1, right) = dynamic(left, right)와 같다.