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
    private static int[][] graph;
    private static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        graph = new int[N+1][N+1];
        dist = new int[N+1];

        for (int i = 1; i <= N; i++) {
            dist[i] = INF;
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i != j) {
                    graph[i][j] = INF;
                } else {
                    graph[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list[a].add(new Node(b, c));
            graph[a][b] = Math.min(graph[a][b], c);
        }

        st = new StringTokenizer(br.readLine(), " ");

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        // dijkstra(start);
        dijkstraGraph(start);

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
                if (dist[node.num] > dist[currentNum] + node.weight) { // dist에 기록되어 있는 인접 노드의 가중치 보다 현재 노드의 가중치 + 인접 노드의 가중치가 적다면
                    dist[node.num] = dist[currentNum] + node.weight; // 갱신
                    pq.add(new Node(node.num, dist[node.num])); // 우선 순위 큐에 갱신 된 노드를 추가
                }
            }
        }
    }

    private static void dijkstraGraph(int start) {
        boolean[] visited = new boolean[N + 1];
        dist[start] = 0;

        for (int i = 1; i <= N; i++) {
            dist[i] = graph[start][i]; // 시작 노드에서 각 노드까지의 초기 거리 설정
        }

        for (int i = 1; i <= N; i++) {
            int currentNum = -1;
            int minDist = INF;

            // 방문하지 않은 노드 중 가장 거리가 짧은 노드 찾기
            for (int j = 1; j <= N; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    currentNum = j;
                }
            }

            if (currentNum == -1) break; // 더 이상 방문할 노드가 없으면 종료

            visited[currentNum] = true;

            // 현재 노드와 연결된 노드의 거리 업데이트
            for (int j = 1; j <= N; j++) {
                if (!visited[j] && graph[currentNum][j] != INF) {
                    dist[j] = Math.min(dist[j], dist[currentNum] + graph[currentNum][j]);
                }
            }
        }
    }
}
