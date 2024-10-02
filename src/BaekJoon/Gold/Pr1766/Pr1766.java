package BaekJoon.Gold.Pr1766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr1766 {

    private static int N, M;
    private static StringBuilder sb;
    private static ArrayList<ArrayList<Integer>> arrayList; // 인접리스트
    private static int[] indegree; // 진입차수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arrayList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            arrayList.add(new ArrayList<>());
        } // 인접리스트 초기화

        indegree = new int[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayList.get(a).add(b);
            indegree[b]++;
        }

        sb = new StringBuilder();
        topologicalSort();

        System.out.println(sb);
    }

    private static void topologicalSort() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                pq.offer(i);
            }
        }

        while (!pq.isEmpty()) {
            int node = pq.poll();
            sb.append(node).append(" ");
            ArrayList<Integer> target = arrayList.get(node);

            for (int t : target) {
                indegree[t] --;

                if (indegree[t] == 0) {
                    pq.offer(t);
                }
            }
        }
    }
}
