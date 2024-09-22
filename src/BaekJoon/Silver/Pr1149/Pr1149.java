package BaekJoon.Silver.Pr1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1149 {

    private static int N;
    private static int[][] array, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        array = new int[N][3];
        dp = new int[N][3];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            array[i][0] = Integer.parseInt(st.nextToken()); // R
            array[i][1] = Integer.parseInt(st.nextToken()); // G
            array[i][2] = Integer.parseInt(st.nextToken()); // B
        }

        dp[0][0] = array[0][0];
        dp[0][1] = array[0][1];
        dp[0][2] = array[0][2]; // dp의 첫 값 초기화 작업

        System.out.println(Math.min(dynaminc(N-1, 0), Math.min(dynaminc(N-1, 1), dynaminc(N-1, 2)))); // N-1 부터 Top-bottom 형식으로 탐색
        // 각 색깔이 집에 색칠되었을 때의 최솟값을 dp에 저장한다. 이후 최솟값을 반환한다. 위는 (Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]))의 출력 값과 같음
    }

    private static int dynaminc(int house, int color) { // house는 집 선택 변수, color는 색깔 선택 변수
        if (dp[house][color] == 0) { // 탐색되지 않은 배열일 경우
            switch (color) {
                case 0 -> dp[house][0] = Math.min(dynaminc(house-1, 1), dynaminc(house-1, 2)) + array[house][color]; // R + G 혹은 R + B 중 작은 수 선택
                case 1 -> dp[house][1] = Math.min(dynaminc(house-1, 0), dynaminc(house-1, 2)) + array[house][color]; // G + R 혹은 G + B 중 작은 수 선택
                case 2 -> dp[house][2] = Math.min(dynaminc(house-1, 0), dynaminc(house-1, 1)) + array[house][color]; // B + R 혹은 B + G 중 작은 수 선택
            }
        }

        return dp[house][color]; // 이미 탐색 된 배열인 경우 반환
    }
}
