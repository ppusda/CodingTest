package BaekJoon.Silver.Pr2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[5001]; // N의 최대인 5000까지 초기화, 여기서의 dp는 인덱스의 무게를 들고갈 수 있는 봉지의 최소값을 저장하는 배열임
        dp[3] = dp[5] = 1; // 3무게의 봉지를 들었을 때, 5무게의 봉지를 들었을 때는 각각 한개의 봉지를 들고 갈 수 있음

        for (int i = 6; i <= N; i++) { // 5 다음인 6부터 시작함
            if (dp[i-3] != 0) dp[i] = dp[i-3] + 1; // 만약 3무게의 봉지를 들어야할 때, 이전 무게에서 들 수 있는 봉지가 있었다면 해당 봉지 개수에 더해주면 됨
            if (dp[i-5] != 0) dp[i] = dp[i] != 0 ? Math.min(dp[i], dp[i-5] + 1) : dp[i-5] + 1; // 5무게의 봉지도 마찬가지이지만, 3과 겹치는 순간에 5봉지로 개수를 더 낮춰 들 수 있다면 갱신
        }

        System.out.println(dp[N] == 0 ? -1 : dp[N]); // 업데이트 된 봉지의 개수가 있다면 해당 수 출력, 아니라면 -1 출력
    }
}
