package BaekJoon.Gold.Pr1916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr1916 {

    private static class Node implements Comparable<Node>{
        public int num;
        public int weight;

        public Node(int num, int weight) {
            this.num = num;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    private static int INF = 999999999;
    private static int N, M;
    private static ArrayList<Node>[] list;
    private static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        dist = new int[N+1];

        for (int i = 1; i <= N; i++) {
            dist[i] = INF;
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list[a].add(new Node(b, c));
        }

        st = new StringTokenizer(br.readLine(), " ");

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijkstra(start);

        System.out.println(dist[end]);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;
        boolean[] visited = new boolean[N+1];

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentNum = current.num;

            if (visited[currentNum]) continue;

            visited[currentNum] = true;
            for (Node node : list[currentNum]) {
                if (dist[node.num] > dist[currentNum] + node.weight) { // 현재 노드의 가중치 + 갈수 있는 방향의 가중치가 dist[]에 기록되어있는 해당 노드의 가중치 보다 작다면
                    dist[node.num] = dist[currentNum] + node.weight; // 갱신
                    pq.add(new Node(node.num, dist[node.num])); // 우선 순위 큐에 갱신되 노드를 추가
                }
            }
        }
    }
}
