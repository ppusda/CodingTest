package Pr08.Pr11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Pr08_my11 {
    private static int answer = 0;
    private static int[][] board, dis;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    private void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        while(!queue.isEmpty()){
            Point pt = queue.poll();
            if(dis[7][7] > 0){
                answer = dis[7][7];
                return;
            }
            for(int i = 0; i < 4; i ++){
                int dix = pt.x + dx[i];
                int diy = pt.y + dy[i];
                if(dix >= 1 && dix <= 7 && diy >= 1 && diy <= 7 && dis[dix][diy] == 0 && board[dix][diy] == 0){
                    queue.offer(new Point(dix, diy));
                    dis[dix][diy] = dis[x][y] + 1; // pt.x, pt.y를 했어야했다.
                    board[x][y] = 1; // dix, diy를 바꿨어야 했다.
                }
            }

        }

    }

    public static void main(String[] args) {
        Pr08_my11 pr = new Pr08_my11();
        Scanner sc = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];
        for(int i = 1; i < 8; i++){
            for(int j = 1; j < 8; j++){
                board[i][j] = sc.nextInt();
            }
        }

        pr.BFS(1, 1);
        System.out.println(answer);
    }
}
