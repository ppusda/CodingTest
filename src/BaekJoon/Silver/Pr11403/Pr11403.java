package BaekJoon.Silver.Pr11403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr11403 {

    private static int N;
    private static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        floydWarshall();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void floydWarshall() {
        for (int i = 0; i < N; i++) { // 가운데
            for (int j = 0; j < N; j++) { // 시작
                for (int k = 0; k < N; k++) { // 끝
                    if (graph[j][k] > 0 || graph[j][i] + graph[i][k] > 1) {
                        graph[j][k] = 1;
                    }
                }
            }
        }
    }
}
