package Programmers.Lv3.Pr49189;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Pr49189 {
    private static int[] ch, dist;
    private static ArrayList<ArrayList<Integer>> graph;
    public int solution(int n, int[][] edge) {
        graph = new ArrayList<>();
        ch = new int[n+1];
        dist = new int[n+1];

        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for (int[] i : edge) {
            graph.get(i[1]).add(i[0]);
            graph.get(i[0]).add(i[1]);
        }

        bfs(1);

        int maxDist = 0;
        for (int d : dist) {
            if (d > maxDist) {
                maxDist = d;
            }
        }

        int count = 0;
        for (int d : dist) {
            if (d == maxDist) {
                count++;
            }
        }

        return count;
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        ch[v] = 1;
        while (!queue.isEmpty()) {
            int value = queue.poll();
            for (int gv : graph.get(value)) {
                if (ch[gv] == 0) {
                    ch[gv] = 1;
                    dist[gv] = dist[value] + 1;
                    queue.offer(gv);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Pr49189().solution(6, new int[][] {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}));
    }
}
