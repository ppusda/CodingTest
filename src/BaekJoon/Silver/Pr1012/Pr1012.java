package BaekJoon.Silver.Pr1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1012 {

    private static int[] dx = new int[] {1, 0, -1, 0};
    private static int[] dy = new int[] {0, -1, 0, 1};

    private static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken()); // 가로 길이
            int n = Integer.parseInt(st.nextToken()); // 세로 길이
            int k = Integer.parseInt(st.nextToken()); // 배추 개수

            graph = new int[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }

            int answer = 0;
            for (int j = 0; j < m; j++) {
                for (int p = 0; p < n; p++) {
                    if (graph[j][p] == 1) {
                        DFS(j, p, m, n);
                        answer ++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    private static void DFS(int x, int y, int m, int n) {
        for (int i = 0; i < 4; i ++) {
            int dix = x + dx[i];
            int diy = y + dy[i];
            if (dix >= 0 && dix < m && diy >= 0 && diy < n && graph[dix][diy] == 1) {
                graph[dix][diy] = 0;
                DFS(dix, diy, m, n);
            }
        }
    }
}
