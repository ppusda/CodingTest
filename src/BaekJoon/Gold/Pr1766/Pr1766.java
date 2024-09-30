package BaekJoon.Gold.Pr1766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1766 {

    private static int N, M;
    private static StringBuilder sb;
    private static ArrayList<ArrayList<Integer>> arrayList;
    private static int[] count; // 간선 확인용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arrayList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            arrayList.add(new ArrayList<>());
        }

        count = new int[N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayList.get(a).add(b); // a 는 b 보다 먼저 푸는게 좋음
            count[b]++;
        }

        sb = new StringBuilder();
        topologicalSort();

        System.out.println(sb);
    }

    private static void topologicalSort() { // 위 상 정 렬
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i <= N; i++) {
            if (count[i] == 0) {
                pq.offer(i);
            }
        }

        while (!pq.isEmpty()) {
            int node = pq.poll();
            sb.append(node).append(" ");
            ArrayList<Integer> target = arrayList.get(node);

            for (int t : target) {
                count[t] --;

                if (count[t] == 0) {
                    pq.offer(t);
                }
            }
        }
    }
}
