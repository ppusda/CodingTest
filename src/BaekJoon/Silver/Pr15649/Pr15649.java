package BaekJoon.Silver.Pr15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr15649 {

    private static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 숫자 개수
        int m = Integer.parseInt(st.nextToken()); // 출력 길이

        visited = new int[n+1];
        for (int i = 1; i <= n; i++) {
            visited[i] = 1;
            backTracking(i + " ", 1, n, m);
            visited[i] = 0;
        }
    }

    private static void backTracking(String str, int level, int n, int m) {
        if (level > m) {
            return;
        }

        if (level == m) {
            System.out.println(str);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                int nextLevel = level + 1;
                backTracking(str + i + " ", nextLevel, n, m);
                visited[i] = 0;
            }
        }
    }
}
