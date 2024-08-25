package BaekJoon.Silver.Pr14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Pr14889 {

    private static int[][] graph;
    private static int[] visit;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visit = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0, n);
        System.out.println(answer);
    }

    private static void dfs(int i, int depth, int n) { // i는 선택될 인덱스의 번호, depth는 DFS의 깊이
        if (answer == 0) {
            return;
        }

        if (depth == n/2) {
            check(n);
            return;
        }

        for (int j = i; j < n; j++) {
            if (visit[j] == 0) {
                visit[j] = 1;
                dfs(j+1, depth+1, n); // 현재의 다음 인덱스 번호를 사용하기 위함, 재귀
                visit[j] = 0;
            }
        }
    }

    private static void check(int n) {
        int start = 0;
        int link = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (visit[i] == 1 && visit[j] == 1) { // 같은 팀으로 되었을 때 시너지 계산
                    start += graph[i][j];
                    start += graph[j][i];
                } else if (visit[i] == 0 && visit[j] == 0){
                    link += graph[i][j];
                    link += graph[j][i];
                }
            }
        }

        answer = Math.min(answer, Math.abs(start-link));
    }
}
