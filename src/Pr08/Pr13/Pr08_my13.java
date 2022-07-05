package Pr08.Pr13;

import java.util.Scanner;

public class Pr08_my13 {
    private static int answer = 0;
    private static int[][] board;
    private static int n;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    private void solve(){
        for(int k = 0; k < n; k++){
            for (int p = 0; p < n; p++){
                if(board[k][p] == 1){
                    answer ++;
                    DFS(k, p);
                }
            }
        }
    }

    private void DFS(int k, int p){
        for (int z = 0; z < dx.length; z++){
            int dix = k + dx[z];
            int diy = p + dy[z];
            if(dix >= 0 && diy >= 0 && dix < n && diy < n && board[dix][diy] == 1){
                board[dix][diy] = 0;
                DFS(dix, diy);
            }
        }
    }

    public static void main(String[] args) {
        Pr08_my13 pr = new Pr08_my13();
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
