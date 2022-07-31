package Inflearn.Pr08.Pr12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Pr08_my12 {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] board, dis;
    private static int n, m;
    private static Queue<Point> queue = new LinkedList<>();

    private void BFS(){
        while (!queue.isEmpty()){
            Point tmp = queue.poll();

            for (int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr08_my12 pr = new Pr08_my12();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        pr.BFS();

        boolean flag = true;
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 0){
                    flag = false;
                }
            }
        }

        if(flag){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }

    }
}
