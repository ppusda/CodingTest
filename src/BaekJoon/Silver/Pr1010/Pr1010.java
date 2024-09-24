package BaekJoon.Silver.Pr1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1010 {

    private static int T;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        dp = new int[30][30];

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == m) {
                System.out.println(1);
                continue;
            }

            System.out.println(dynamic(m,n));
        }
    }

    private static int dynamic(int left, int right) {
        if (dp[left][right] > 0) return dp[left][right]; // 이미 있는 경우에 반환
        if (left == right || right == 0) return dp[left][right] = 1; // 같은 개수인 경우, 아무것도 선택할 수 없는 경우도 1로 초기화 한다.
        return dp[left][right] = dynamic(left-1, right-1) + dynamic(left-1, right); // 아래 설명 참고
    }
}

// n+1 C r+1 = n C r + n C r+1
// n C r = n-1 C r-1 + n-1 C r 과 같다.
// 이는 파스칼의 법칙을 이용한 부분이며, 위의 함수에 적용하여 dynamic(left-1, right-1) + dynamic(left-1, right) = dynamic(left, right)와 같다.