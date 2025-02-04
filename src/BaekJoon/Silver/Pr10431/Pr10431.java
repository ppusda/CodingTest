package BaekJoon.Silver.Pr10431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr10431 {

	private static int[] arr;
	private static int count;
	private static final StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int P = Integer.parseInt(br.readLine());

		for (int i = 0; i < P; i++) {
			arr = new int[20];
			count = 0;

			st = new StringTokenizer(br.readLine());
			String caseNum = st.nextToken();
			for (int j = 0; j < 20; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			int index = 1;
			while (index < 20) {
				int check = checkFront(index);
				if (check != -1) {
					backstep(index, check);
				} else {
					index ++;
				}
			}

			sb.append(caseNum).append(" ").append(count).append("\n");
		}

		System.out.println(sb);
	}

	private static int checkFront(int i) {
		int target = -1;
		for (int k = i-1; k >= 0; k--) {
			if (arr[k] > arr[i]) target = k;
		}
		return target;
	}

	private static void backstep(int i, int check) {
		int temp = arr[i];

		for (int k = i; k > check; k--) {
			arr[k] = arr[k-1];
			count++;
		}

		arr[check] = temp;
	}
}
