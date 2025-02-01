package BaekJoon.Bronze.Pr2816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2816 {
	private static String[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 채널 개수
		int KBSIndex = 0;

		arr = new String[N];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if (str.equals("KBS1")) {
				KBSIndex = i;
			}
			arr[i] = str;
		}
		printAction(KBSIndex, 0);

		for (int i = 0; i < N; i++) {
			if (arr[i].equals("KBS2")) {
				KBSIndex = i;
			}
		}
		printAction(KBSIndex, 1);
	}

	private static void printAction(int index, int target) {
		int now = 0;
		while (now < index) {
			System.out.print(1);
			now++;
		}
		while (now > target) {
			String temp = arr[now];
			arr[now] = arr[now-1];
			arr[now-1] = temp;

			System.out.print(4);
			now--;
		}
	}
}
