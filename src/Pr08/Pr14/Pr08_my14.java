package Pr08.Pr14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class Pr08_my14 {
    private static int answer = 0;
    private static int[][] board;
    private static int n;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    private static Queue<Point> queue = new LinkedList<>();

    private void BFS(Point pt) {
        queue.offer(pt);
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int z = 0; z < dx.length; z++) {
                int dix = tmp.x + dx[z];
                int diy = tmp.y + dy[z];
                if (dix >= 0 && diy >= 0 && dix < n && diy < n && board[dix][diy] == 1) {
                    board[dix][diy] = 0;
                    queue.offer(new Point(dix, diy));
                }
            }
        }
    }

    private void solution() {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    BFS(new Point(i, j));
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr08_my14 pr = new Pr08_my14();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        pr.solution();
        System.out.println(answer);
    }
}
