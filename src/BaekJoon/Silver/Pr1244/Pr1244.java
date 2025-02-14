package BaekJoon.Silver.Pr1244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1244 {

	private static int switchCount;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		switchCount = Integer.parseInt(br.readLine());

		arr = new int[switchCount+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= switchCount; i++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}

		int studentCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < studentCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			swapSwitch(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= switchCount; i++) {
			sb.append(arr[i]).append(" ");
			if (i % 20 == 0) sb.append("\n");
		}

		System.out.println(sb);
	}

	private static void swapSwitch(int gender, int targetSwitch) {
		if (gender == 1) {
			maleAction(targetSwitch);
		} else {
			femaleAction(targetSwitch);
		}
	}

	private static void maleAction(int targetSwitch) {
		for (int i = 1; i <= switchCount; i++) {
			if (i % targetSwitch == 0) {
				swap(i);
			}
		}
	}

	private static void femaleAction(int targetSwitch) {
		int left = targetSwitch - 1;
		int right = targetSwitch + 1;

		swap(targetSwitch); // 선택된 인덱스는 항상 변경되어야 함.

		while (true) {
			if (left >= 1 && right <= switchCount && arr[left] == arr[right]) {
				swap(left);
				swap(right);
				left--;
				right++;
			} else {
				break;
			}
		}
	}

	private static void swap(int index) {
		arr[index] = arr[index] == 0 ? 1 : 0;
	}
}
