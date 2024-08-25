package BaekJoon.Gold.Pr7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr7576 {

    private static int[] dx = new int[] {1, 0, -1, 0};
    private static int[] dy = new int[] {0, -1, 0, 1};

    private static int[][] graph;

    private static Queue<Point> queue;

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int number = Integer.parseInt(st.nextToken());
                if (number == 1) {
                    queue.offer(new Point(i, j));
                }
                graph[i][j] = number;
            }
        }

        int answer = BFS(n, m);
        if (checkZero(n, m)) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }

    private static int BFS(int n, int m) {
        int level = 0;
        boolean flag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point pt = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int dix = pt.x + dx[j];
                    int diy = pt.y + dy[j];
                    if (dix >= 0 && dix < n && diy >= 0 && diy < m && graph[dix][diy] == 0) {
                        queue.offer(new Point(dix, diy));
                        graph[dix][diy] = 1;
                        flag = true;
                    }
                }
            }

            if (flag) {
                level ++;
                flag = false;
            }
        }

        return level;
    }


    private static boolean checkZero(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
