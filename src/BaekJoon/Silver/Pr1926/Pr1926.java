package BaekJoon.Silver.Pr1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1926 {

	static class Point {
		public int x;
		public int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static int N, M;
	private static int[][] adjArray;

	private static int[] dx = new int[] {1, 0, -1, 0};
	private static int[] dy = new int[] {0, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br. readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		adjArray = new int[N+1][M+1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br. readLine(), " ");
			for (int j = 1; j <= M; j++) {
				adjArray[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 0;
		int max = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (adjArray[i][j] == 1) {
					count++;
					max = Math.max(max, BFS(new Point(i, j)));
				}
			}
		}

		System.out.println(count);
		System.out.println(max);
	}

	private static int BFS(Point start) {
		Queue<Point> queue = new LinkedList<>();
		adjArray[start.x][start.y] = 0;
		queue.add(start);

		int count = 0;
		while (!queue.isEmpty()) {
			Point point = queue.poll();

			for (int i = 0; i < 4; i++) {
				int dix = point.x + dx[i];
				int diy = point.y + dy[i];

				if (dix > 0 && dix <= N && diy > 0 && diy <= M && adjArray[dix][diy] == 1) {
					adjArray[dix][diy] = 0;
					queue.add(new Point(dix, diy));
					count ++;
				}
			}
		}

		return count+1;
	}
}
