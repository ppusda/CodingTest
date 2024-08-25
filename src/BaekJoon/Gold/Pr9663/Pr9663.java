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


    private static void backtracking(int depth, int n) { // depth 는 세로 위치
        if (depth > n) { // depth가 더 커지면 종료
            answer++;
            return;
        }

        for (int i = 1; i <= n; i++) { // 가로 어디에 놓을 건지 확인
            col[depth] = i;  // 퀸을 놓음
            if (promising(depth)) {
                backtracking(depth + 1, n);
            }
        }
    }

    private static boolean promising(int i) {
        for (int k = 1; k < i; k++) {
            if (col[i] == col[k] || Math.abs(col[i] - col[k]) == Math.abs(i - k)) { // 몇 번째 에 뒀는지와 대각선 범위 체크
                return false;
            }
        }
        return true;
    }
}
