package BaekJoon.Silver.Pr20125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr20125 {

	private static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static int[][] arr;
	private static int[] answer;
	private static int N;
	private static Node heart;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		answer = new int[5]; // 왼쪽 팔, 오른쪽 팔, 허리, 왼쪽 다리, 오른쪽 다리 입력
		boolean headFlag = true;
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				if (str[j].equals("*")) {
					if (headFlag) { // 첫번째는 반드시 머리가 들어롬
						heart = new Node(i+1, j); // 머리 바로 아래에 심장이 있으므로 이를 기록
						headFlag = false;
					}
					arr[i][j] = 1;
				}
			}
		}


		answer[0] = searchLeftArm();
		answer[1] = searchRightArm();
		answer[2] = searchWaist();
		answer[3] = searchLeftLeg();
		answer[4] = searchRightLeg();

		StringBuilder sb = new StringBuilder();
		sb.append(heart.x+1).append(" ").append(heart.y+1).append("\n");
		sb.append(answer[0]).append(" ").append(answer[1]).append(" ").append(answer[2]).append(" ").append(answer[3]).append(" ").append(answer[4]);
		System.out.println(sb);
	}

	private static int searchLeftArm()  {
		int x = heart.x;
		int y = heart.y;
		int count = 0;
		while (y-1 >= 0 && arr[x][--y] == 1) {
			count++;
		}

		return count;
	}

	private static int searchRightArm()  {
		int x = heart.x;
		int y = heart.y;
		int count = 0;
		while (y+1 < N && arr[x][++y] == 1) {
			count++;
		}

		return count;
	}

	private static int searchWaist()  {
		int x = heart.x;
		int y = heart.y;
		int count = 0;
		while (arr[++x][y] == 1) {
			count++;
		}

		return count;
	}

	private static int searchLeftLeg() {
		int x = heart.x + answer[2];
		int y = heart.y - 1;
		int count = 0;
		while (x+1 < N && arr[++x][y] == 1) {
			count++;
		}

		return count;
	}

	private static int searchRightLeg() {
		int x = heart.x + answer[2];
		int y = heart.y + 1;
		int count = 0;
		while (x+1 < N && arr[++x][y] == 1) {
			count++;
		}

		return count;
	}
}
