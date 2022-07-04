package Pr08.Pr13;

import java.util.Scanner;

public class Pr08_lr13 {
    private static int answer = 0;
    private static int[][] board;
    private static int n;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    private void DFS(int i, int j) {
        for (int z = 0; z < dx.length; z++) {
            int dix = i + dx[z];
            int diy = j + dy[z];
            if (dix >= 0 && diy >= 0 && dix < 7 && diy < 7 && board[dix][diy] == 1) {
                board[dix][diy] = 0;
                DFS(dix, diy);
            }
        }
    }

    private void solve(){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    answer ++;
                    DFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr08_lr13 pr = new Pr08_lr13();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        pr.solve();
        System.out.println(answer);
    }
}
