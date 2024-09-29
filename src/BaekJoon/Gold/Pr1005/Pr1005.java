package BaekJoon.Gold.Pr1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1005 {

    private static int n;   // 노드 갯수
    private static int k;   // 간선 갯수
    private static int[] d; // 가중치 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            d = new int[n+1];

            List<List<Integer>> list = new ArrayList<>(); // 인접리스트
            for(int i = 0; i < n+1; i++) {
                list.add(new ArrayList<>());
            }

            int[] indegree = new int[n+1]; // 총 소요시간 기록

            st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= n; i++) {
                d[i] = Integer.parseInt(st.nextToken()); // 가중치 기록
            }

            for(int i=0; i<k; i++) {
                st = new StringTokenizer(br.readLine());

                // v1 -> v2 방향 기록
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());

                list.get(v1).add(v2); // 인접리스트에 추가
                indegree[v2]++; // 소요시간
            }

            int w = Integer.parseInt(br.readLine());

            topologicalSort(indegree, list, w);
        }
    }

    private static void topologicalSort(int[] indegree, List<List<Integer>> list, int w) {
        Queue<Integer> q = new LinkedList<>();
        int[] result = new int[n+1];

        // 건물의 소요 기본 소요시간은 d[i]
        for(int i=1; i<=n; i++) {
            result[i] = d[i];

            if(indegree[i] == 0)
                q.offer(i);
        }

        // 건물의 총 소요시간 = 이전까지의 소요시간 + 현재 건물 소요시간
        // max 해주는 이유는 이전 테크가 다 올라야 현재 건물을 지을 수 있기 때문
        while(!q.isEmpty()) {
            int node = q.poll();

            for(Integer i : list.get(node)) {
                result[i] = Math.max(result[i], result[node] + d[i]);
                indegree[i]--;

                if(indegree[i] == 0)
                    q.offer(i);
            }
        }

        System.out.println(result[w]);
    }
}
