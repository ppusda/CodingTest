package BaekJoon.Silver.Pr2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr2178 {

    private static int[] dx = new int[] {1, 0, -1, 0};
    private static int[] dy = new int[] {0, -1, 0, 1}; // 오른쪽, 아래, 왼쪽, 위
    private static int[][] graph, dis;

    private static class Point{
        public int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < input.length; j++) {
                graph[i][j] = Integer.parseInt(input[j]);
            }
        }

        BFS(0, 0, n, m);
        System.out.println(dis[n-1][m-1]);
    }

    private static void BFS(int x, int y, int n, int m) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        graph[x][y] = 0;
        dis[x][y] = 1;

        while (!queue.isEmpty()) {
            Point pt = queue.poll();
            if(dis[n-1][m-1] > 0){
                return;
            }
            for (int i = 0; i < 4; i++) {
                int dix = pt.x + dx[i];
                int diy = pt.y + dy[i];
                if (dix >= 0 && dix < n && diy >= 0 && diy < m && graph[dix][diy] == 1) {
                    graph[dix][diy] = 0;
                    queue.offer(new Point(dix, diy));
                    dis[dix][diy] = dis[pt.x][pt.y]+1;
                }
            }
        }
    }
}
