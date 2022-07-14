package Pr09.Pr05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int vex, cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Pr09_my05 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    private void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while (!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(nowCost > dis[now]){
                continue;
            }
            for (Edge edge : graph.get(now)) {
                if(dis[edge.vex] > nowCost + edge.cost){
                    dis[edge.vex] = nowCost + edge.cost;
                    pQ.offer(new Edge(edge.vex, nowCost + edge.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr09_my05 pr = new Pr09_my05();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }

        pr.solution(1);
        for(int i = 2; i <= n; i++){
            if(dis[i] != Integer.MAX_VALUE){
                System.out.println(i + " : " + dis[i]);
            }else{
                System.out.println(i + "impossible");
            }
        }
    }
}

/***
 * 다익스트라 알고리즘
 * 그동안 배운것들을 모두 활용하는 느낌이다.
 * 인접리스트, class 이용, PriorityQueue...
 *
 * 먼저 인접리스트이다. (graph)
 *
 * a는 각 노드 (정점) 이다.
 * b는 갈 수 있는 노드 (정점) 이다.
 * c는 가는 것에 대한 가중치이다.
 *
 * 이를 통해서 인접리스트를 완성시킨다. (ArrayList<ArrayList<Edge>> 이용)
 *
 * solution 에서는  ArrayList.get(now)를 통해 (now가 노드) 노드에 대한 간선 정보를 알 수 있다.
 * 이를 통해서 dis[]에 최소 가중치 값을 넣어두는 방식으로 이루어진다.
 *
 *
 */