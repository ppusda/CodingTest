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

    private static int N;   // 노드 갯수
    private static int K;   // 간선 갯수
    private static int[] weight, count; // 가중치 배열,  배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            weight = new int[N+1];
            count = new int[N+1];

            List<List<Integer>> list = new ArrayList<>(); // 인접리스트
            for (int i = 0; i < N+1; i++) {
                list.add(new ArrayList<>());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                weight[i] = Integer.parseInt(st.nextToken()); // 가중치 기록
            }

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());

                // v1 -> v2 방향 기록
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());

                list.get(v1).add(v2); // 인접리스트에 추가
                count[v2]++; // 다른 노드에서의 간선이 있는 경우 count를 증가
            }

            int w = Integer.parseInt(br.readLine());
            topologicalSort(list, w);
        }
    }

    private static void topologicalSort(List<List<Integer>> list, int w) {
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[N+1];

        for (int i = 1; i <= N; i++) {
            result[i] = weight[i]; // 건물 기본 소요시간 설정
            if(count[i] == 0) { // 더 이상 해당 노드로 오는 간선이 없다면
                queue.offer(i); // 큐에 추가하여 사용완료 처리
            }
        }

        // 건물의 총 소요시간 = 이전 까지의 소요시간 + 현재 건물 소요시간
        // 이전 노드의 소요시간이 모두 지나야지 현재 건물을 지을 수 있기 때문에 Math.max로 큰 값 선택하여 할당
        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer i : list.get(node)) {
                result[i] = Math.max(result[i], result[node] + weight[i]); // 이전 까지의 가중치 + 현재 가중치
                count[i]--;

                if (count[i] == 0) {
                    queue.offer(i);
                }
            }
        }

        System.out.println(result[w]); // 총 소요시간 출력
    }
}
