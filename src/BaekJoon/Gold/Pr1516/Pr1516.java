package BaekJoon.Gold.Pr1516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1516 {

    private static int N;
    private static ArrayList<ArrayList<Integer>> list;
    private static int[] count, weight, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        count = new int[N+1];
        weight = new int[N+1];
        result = new int[N+1];

        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            weight[i] = Integer.parseInt(st.nextToken());
            int temp = Integer.parseInt(st.nextToken());
            while (temp != -1) {
                list.get(temp).add(i); // i를 짓기 위해 temp가 선행되어야 함.
                count[i] ++;

                temp = Integer.parseInt(st.nextToken());
            }
        }

        topologicalSort();

        for (int i = 1; i <= N; i++) {
            System.out.println(result[i]);
        }
    }

    private static void topologicalSort() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            result[i] = weight[i]; // 가중치 초기화
            if (count[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            ArrayList<Integer> target = list.get(node);

            for (int t : target) {
                count[t] --;
                result[t] = Math.max(result[t], result[node] + weight[t]);
                if (count[t] == 0) {
                    queue.offer(t);
                }
            }
        }
    }
}
