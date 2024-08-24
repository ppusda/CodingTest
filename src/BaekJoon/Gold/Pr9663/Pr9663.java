package BaekJoon.Gold.Pr9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr9663 {

    private static int[] col;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        col = new int[n+1];

        backtracking(1, n);
        System.out.println(answer);
    }


    private static void backtracking(int depth, int n) {
        if (depth > n) {
            answer++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            col[depth] = i;  // 퀸을 놓음
            if (promising(depth)) {
                backtracking(depth + 1, n);
            }
        }
    }

    private static boolean promising(int i) {
        for (int k = 1; k < i; k++) {
            if (col[i] == col[k] || Math.abs(col[i] - col[k]) == Math.abs(i - k)) {
                return false;
            }
        }
        return true;
    }
}
