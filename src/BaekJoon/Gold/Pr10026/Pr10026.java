package BaekJoon.Gold.Pr10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Pr10026 {

	private static char[][] adjArray;
	private static boolean[][] visited;

	private static int N;
	private static final int[] dx = new int[] {1, 0, -1, 0};
	private static final int[] dy = new int[] {0, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		adjArray = new char[N+1][N+1];
		visited = new boolean[N+1][N+1];

		for (int i = 1; i <= N; i++) {
			char[] splitLine = br.readLine().toCharArray();
			for (int j = 1; j <= N; j++) {
				adjArray[i][j] = splitLine[j-1];
			}
		}

		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					count++;
				}
			}
		}

		visited = new boolean[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (adjArray[i][j] == 'G') {
					adjArray[i][j] = 'R';
				}
			}
		}

		int colorBlindCount = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					colorBlindCount++;
				}
			}
		}

		System.out.println(count + " " + colorBlindCount);
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;

		char str = adjArray[x][y];
		for (int k = 0; k < 4; k++) {
			int dix = x + dx[k];
			int diy = y + dy[k];

			if (dix > 0 && dix <= N && diy > 0 && diy <= N && !visited[dix][diy] && str == adjArray[dix][diy]) {
				dfs(dix, diy);
			}
		}
	}

}
