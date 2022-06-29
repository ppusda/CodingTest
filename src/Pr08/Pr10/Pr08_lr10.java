package Pr08.Pr10;

import java.util.Scanner;

public class Pr08_lr10 {
    private static int answer = 0;
    private static int[][] board;

    // 이중배열을 기준으로 12, 3, 6, 9
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public void DFS(int x, int y){
        if(x == 7 && y == 7){
            answer++;
        }else{
            for(int i = 0; i < 4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx >= 1 && ny >= 1 && nx <= 7 && ny<= 7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr08_lr10 pr = new Pr08_lr10();
        Scanner sc = new Scanner(System.in);

        board = new int[8][8];

        for(int i = 1; i < 8; i++){
            for(int j = 1; j < 8; j++){
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        pr.DFS(1, 1);
        System.out.println(answer);
    }
}
