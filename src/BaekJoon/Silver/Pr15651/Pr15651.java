package BaekJoon.Silver.Pr15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr15651 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 숫자 개수
        int m = Integer.parseInt(st.nextToken()); // 출력 길이

        for (int i = 1; i <= n; i++) {
            backTracking(i + " ", 1, n, m);
        }

        System.out.println(sb);
    }

    private static void backTracking(String str, int level, int n, int m) {
        if (level == m) {
            sb.append(str).append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            int nextLevel = level + 1;
            backTracking(str + i + " ", nextLevel, n, m);
        }
    }
}
