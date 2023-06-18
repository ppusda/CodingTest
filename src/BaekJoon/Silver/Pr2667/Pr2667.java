package BaekJoon.Silver.Pr2667;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Pr2667 {

    private static int count = 0, n;
    private static int[][] board, check;
    private static ArrayList<Integer> arr;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static void DFS(int a, int b){
        check[a][b] = 1;

        for(int i = 0; i < 4; i++){
            int dix = a + dx[i];
            int diy = b + dy[i];
            if(dix >= 0 && dix < n && diy >= 0 && diy < n){
                if(board[dix][diy] == 1 && check[dix][diy] != 1){
                    DFS(dix, diy);
                    count ++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];
        check = new int[n][n];
        for(int i = 0; i < n; i++){
            String input = sc.next();
            for(int j = 0; j < n; j++){
                board[i][j] = input.charAt(j)-'0';
            }
        }

        arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1 && check[i][j] != 1){
                    count = 1;
                    DFS(i, j);
                    arr.add(count);
                }
            }
        }

        arr.sort(Comparator.naturalOrder());

        System.out.println(arr.size());
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
