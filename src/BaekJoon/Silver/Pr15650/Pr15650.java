package BaekJoon.Silver.Pr15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr15650 {

    private static int[] answer;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 숫자 개수
        int m = Integer.parseInt(st.nextToken()); // 출력 길이

        answer = new int[m];

        DFS(1, 0, n, m);
        System.out.println(sb);
    }

    private static void DFS(int at, int level, int n, int m) {
        if (level > m) {
            return;
        }

        if (level == m) {
            for (int num : answer) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i <= n; i++) {
            answer[level] = i;
            DFS(i+1, level + 1, n, m);

        }
    }
}
