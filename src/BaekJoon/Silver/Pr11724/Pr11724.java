package BaekJoon.Silver.Pr11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Pr11724 {

	private static ArrayList<Integer>[] adjList;
	private static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); // 정점의 개수
		adjList = new ArrayList[N+1];
		visited = new int[N+1];
		for (int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList<>();
		}

		int M = Integer.parseInt(st.nextToken()); // 간선의 개수
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			adjList[a].add(b);
			adjList[b].add(a);
		} // 인접리스트 완성

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			if (visited[i] == 0) {
				dfs(i);
				answer++;
			}
		}

		System.out.println(answer);
	}

	private static void dfs(int index) {
		visited[index] = 1;

		for (Integer i : adjList[index]) {
			if (visited[i] == 0) {
				dfs(i);
			}
		}
	}

}
