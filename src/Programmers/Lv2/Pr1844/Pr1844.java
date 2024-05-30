// Programmers: 1844_게임 맵 최단거리
package Programmers.Lv2.Pr1844;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    private final int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Pr1844 {
    private static int n, m;
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static final int DIRECTION_SIZE = dx.length;

    private static int[][] dis;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;

        dis = new int[n][m];
        bfs(0, 0, maps);

        if(dis[n-1][m-1] == 0){
            return -1;
        }

        return dis[n-1][m-1]+1; // 처음 시작점도 포함하여 return
    }

    private static void bfs(int x, int y, int[][] maps) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        maps[x][y] = 0;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < DIRECTION_SIZE; i++) {
                int nx = point.getX() + dx[i];
                int ny = point.getY() + dy[i];

                if (nx >= 0 && nx <= n-1 && ny >= 0 && ny <= m-1 && maps[nx][ny] == 1) { // 상황에 맞춰 변경, nx, ny가 범위를 빠져나가지 못하도록 조건 설정
                    maps[nx][ny] = 0; // 지나온 곳을 막힌 것으로 간주
                    queue.offer(new Point(nx, ny)); // 다음 살펴볼 곳을 등록
                    dis[nx][ny] = dis[point.getX()][point.getY()] + 1; // 몇번 째로 해당 길을 지나가는지 계산
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Pr1844().solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
}
