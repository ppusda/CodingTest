package BaekJoon.Silver.Pr1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1260 {

    private static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수
        int v = Integer.parseInt(st.nextToken()); // 시작할 정점의 번호

        int[][] nodes = new int[n+1][n+1];
        check = new int[n+1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            nodes[x][y] = 1;
            nodes[y][x] = 1; // 양방향 설정
        }

        check[v] = 1;
        System.out.print(v + " ");
        DFS(v, nodes, n);
        System.out.println();

        check = new int[n+1];
        check[v] = 1;
        System.out.print(v + " ");
        BFS(v, nodes, n);
        System.out.println();
    }

    private static void DFS(int v, int[][] nodes, int n) {
        for (int i = 1; i <= n; i++) {
            if (check[i] == 0 && nodes[v][i] == 1) {
                check[i] = 1;
                System.out.print(i + " ");
                DFS(i, nodes, n);
            }
        }
    }

    private static void BFS(int v, int[][] nodes, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (check[i] == 0 && nodes[node][i] == 1) {
                    check[i] = 1;
                    System.out.print(i + " ");
                    queue.add(i);
                }
            }
        }
    }
}
