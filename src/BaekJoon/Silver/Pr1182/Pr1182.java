package BaekJoon.Silver.Pr1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1182 {

    private static int[] array;
    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        array = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0, n, s);
        answer = s == 0 ? answer-1 : answer;
        System.out.println(answer);
    }

    private static void DFS(int depth, int total, int n, int s) {
        if (depth == n) {
            if (total == s) {
                answer ++;
            }
            return;
        }

        DFS(depth + 1, total + array[depth], n,  s); // 해당 depth (=idx)를 사용할 떄
        DFS(depth + 1, total, n, s); // 해당 depth (=idx)를 사용하지 않을 때
    }
}
