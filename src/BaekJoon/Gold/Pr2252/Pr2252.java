package BaekJoon.Gold.Pr2252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr2252 {

    private static List<List<Integer>> list;
    private static StringBuffer answer;
    private static int N;
    private static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        count = new int[N+1];
        list = new ArrayList<>();
        answer = new StringBuffer();
        for(int i = 0; i<=N; i++)
            list.add(new ArrayList<>());

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list.get(A).add(B);
            count[B]++; // 자기 자신으로 올 수 있는 경우에는 count를 올려줌
        }

        //위상 정렬
        topologicalSort();

        System.out.println(answer);
    }

    private static void topologicalSort(){
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=N; i++)
            if(count[i] == 0) // 자기 자신으로 올 수 없는 경우에 queue에 추가
                queue.offer(i);

        for(int i = 0; i<N; i++) {
            if (!queue.isEmpty()) {
                int node = queue.poll();
                answer.append(node).append(" ");

                for (int j = 0; j < list.get(node).size(); j++) {
                    count[list.get(node).get(j)]--; // num 노드에서 갈 수 있는 방향의 count 감소

                    if (count[list.get(node).get(j)] == 0) // 먼저, 0이 될 경우 기록
                        queue.offer(list.get(node).get(j));
                }
            }
        }
    }
}
