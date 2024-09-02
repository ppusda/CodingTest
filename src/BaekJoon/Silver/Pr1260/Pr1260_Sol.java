package BaekJoon.Silver.Pr1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pr1260_Sol {

    private static int N, M, V;
    private static int[][] adjArray;
    private static ArrayList<ArrayList<Integer>> adjList;

    private static boolean[] visited;

    // 재귀 사용
    private static void DFS_Recursion(int v) {
        if (!visited[v]) {
            System.out.print(v + " ");
            visited[v] = true;
        }

        for (int i = 0; i < adjList.get(v).size(); i++) {
            if (visited[adjList.get(v).get(i)]) continue;
            DFS_Recursion(adjList.get(v).get(i));
        }
    }

    private static void DFS_Recursion_AdjArray(int v) {
        if (!visited[v]) {
            System.out.print(v + " ");
            visited[v] = true;
        }

        for (int i = 0; i < adjArray[v].length; i++) {
            if (!visited[i] && adjArray[v][i] == 1) {
                DFS_Recursion(adjArray[v][i]);
            }
        }
    }

    // 스택 사용
    private static void DFS_Stack(int start) {
        Stack <Integer> stack = new Stack();
        stack.add(start);

        while(!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;
            }

            for (int next : adjList.get(node)) {
                if (visited[next]) continue;
                stack.add(next);
            }
        }
    }

    private static void BFS(int root) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(root);
        visited[root] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node+" ");

            for (int i = 0; i < adjList.get(node).size(); i++) {
                if (visited[adjList.get(node).get(i)]) continue;
                queue.add(adjList.get(node).get(i));
                visited[adjList.get(node).get(i)] = true;
            }
        }
    }

    private static void BFS_AdjArray(int root) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(root);
        visited[root] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node+" ");

            for (int i = 0; i < adjArray[node].length; i++) {
                if (!visited[i] && adjArray[node][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 시작할 정점의 번호

        // 인접 리스트 초기화
        adjList = new ArrayList<>();
        for (int i = 0; i < N+1; i++) {
            adjList.add(new ArrayList<>());
        }

        // 인접 행렬 초기화
        adjArray = new int[N+1][N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1); // 인접 리스트

            adjArray[v1][v2] = 1;
            adjArray[v2][v1] = 1; // 인접 행렬
        }

        // 정렬
        for (int i = 0; i < N+1; i++) {
            Collections.sort(adjList.get(i));
        }

        // 스택 DFS를 사용 할 경우 내림차순 정렬 필요
//        for (int i=0; i<N+1; i++) {
//            Collections.sort(adjList.get(i), Collections.reverseOrder());
//        }

        visited = new boolean[N+1];
        DFS_Recursion_AdjArray(V);
        System.out.println();

         // 이후 다시 오름차순 정렬
//         for (int i=0; i<N+1; i++) Collections.sort(graph[i]);

        visited = new boolean[N+1];
        BFS_AdjArray(V);
    }
}
