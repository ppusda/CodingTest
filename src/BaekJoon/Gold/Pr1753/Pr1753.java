package BaekJoon.Gold.Pr1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr1753 {

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

    private static int V, E, K;
    private static ArrayList<ArrayList<Node>> arrayList;
    private static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        K = Integer.parseInt(br.readLine());

        arrayList = new ArrayList<>();
        dist = new int[V+1];
        Arrays.fill(dist, INF);

        for (int i = 0; i <= V; i++) {
            arrayList.add(i, new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arrayList.get(u).add(new Node(v, w));
        }

        dijkstra(K);

        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        boolean[] visit = new boolean[V+1];
        priorityQueue.add(new Node(start, 0)); // 자기 자신은 가중치 0
        dist[start] = 0;

        while(!priorityQueue.isEmpty()) {
            Node current = priorityQueue.poll();
            int target = current.num;

            if(visit[target]) continue;
            visit[target] = true;

            for (Node node : arrayList.get(target)) {
                if (dist[node.num] > dist[target] + node.weight) { // 현재 노드의 가중치 + 다음 노드의 가중치가 다음 노드의 가중치 보다 작다면 갱신
                    dist[node.num] = dist[target] + node.weight;
                    priorityQueue.add(new Node(node.num, dist[node.num]));
                }
            }
        }
    }
}
