package Pr09.Pr07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int node, priority;

    public Node(int node, int priority) {
        this.node = node;
        this.priority = priority;
    }

    @Override
    public int compareTo(Node o) {
        return this.priority - o.priority;
    }
}


public class Pr09_pr07 {
    private static int answer = 0;
    private static int[] chk;
    private static int city, road;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        city = sc.nextInt();
        road = sc.nextInt();
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for(int i = 0; i <= city; i++){
            graph.add(new ArrayList<Node>());
        }

        chk = new int[city+1];
        for(int i = 0; i < road; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        PriorityQueue<Node> pQ = new PriorityQueue<>();
        pQ.offer(new Node(1, 0));
        while (!pQ.isEmpty()){
            Node tmp = pQ.poll();
            int ev = tmp.node;
            if(chk[ev] == 0){
                chk[ev] = 1;
                answer += tmp.priority;
                for (Node nd : graph.get(ev)) {
                    if(chk[nd.node] == 0){
                        pQ.offer(new Node(nd.node, nd.priority));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

/***
 *
 */
