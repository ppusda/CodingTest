package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pr2583 {

    static int[][] board;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int m, n, k, cnt;
    static ArrayList<Integer> arr;

    private static void DFS(int i, int j){
        board[i][j] = 1;
        cnt ++;

        for(int p = 0; p < 4; p++){
            int dix = i + dx[p];
            int diy = j + dy[p];
            if(dix >= 0 && dix < m && diy >= 0 && diy < n && board[dix][diy] == 0){
                DFS(dix, diy);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();

        board = new int[m][n];
        for(int i = 0; i < k; i++){
            int lX = sc.nextInt();
            int lY = sc.nextInt();
            int rX = sc.nextInt();
            int rY = sc.nextInt();

            for(int j = lY; j < rY; j++){
                for(int p = lX; p < rX; p++){
                    board[j][p] = 1;
                }
            }
        }

        arr = new ArrayList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    cnt = 0;
                    DFS(i, j);
                    arr.add(cnt);
                }
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
