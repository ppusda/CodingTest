package BaekJoon.Silver.Pr1389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1389 {
    private static int INF = 99999999;

    private static int N, M;
    private static int[][] array;

    private static int min = Integer.MAX_VALUE;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                array[i][j] = INF;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            array[a][b] = 1;
            array[b][a] = 1;
        }

        floydWarshall();

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += array[i][j];
            }

            if (min == sum) continue;
            if (min > sum) {
                min = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }

    private static void floydWarshall() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (array[j][k] > array[j][i] + array[i][k]) {
                        array[j][k] = array[j][i] + array[i][k];
                    }
                }
            }
        }
    }
}
