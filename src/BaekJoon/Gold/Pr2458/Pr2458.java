package BaekJoon.Gold.Pr2458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr2458 {
    private static int INF = 9999999;

    private static int N, M, answer;
    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = 0;
        array = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                array[i][j] = INF;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            array[a][b] = 1;
            array[b][a] = 2;
        }

        floydWarshall();

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (array[i][j] != INF) {
                    count++;
                }
            }

            if (count == N-1) {
                answer ++;
            }
        }

        System.out.println(answer);
    }

    private static void floydWarshall() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (j == k) continue;
                    if (array[j][i] == 1 && array[i][k] == 1) {
                        array[j][k] = 1;
                        array[k][j] = 2;
                    }
                }
            }
        }
    }
}
