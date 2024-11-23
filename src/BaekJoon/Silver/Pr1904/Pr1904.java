package BaekJoon.Silver.Pr1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr1904 {
    public static int[] dp = new int[1000001];;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[0] = 0; // 0일 때, 0
        dp[1] = 1; // 1일 때, 1
        dp[2] = 2; // 2일 때, 2
        // 3일 때, 3(1+2) => 4일 때, 5(2+3) => 5일 때 8(3+5) 와 같이 이전 값 두 번의 결과를 더한 값임

        for(int i = 3; i < dp.length; i++) { // -1 로 초기화
            dp[i] = -1;
        }

        System.out.println(Tile(N));

    }

    public static int Tile(int N) {
        if(dp[N] == -1) {
            dp[N] = (Tile(N - 1) + Tile((N - 2))) % 15746;
        }
        return dp[N];
    } // 첫 번째 줄에 지원이가 만들 수 있는 길이가 N인 모든 2진 수열의 개수를 15746으로 나눈 나머지를 출력한다.
}
