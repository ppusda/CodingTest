package BaekJoon.Silver.Pr11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr11723 {

	private static final int[] array = new int[21];
	private static final StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			String str = st.nextToken();
			switch (str) {
				case "add":
					add(Integer.parseInt(st.nextToken()));
					break;
				case "remove":
					remove(Integer.parseInt(st.nextToken()));
					break;
				case "check":
					check(Integer.parseInt(st.nextToken()));
					break;
				case "toggle":
					toggle(Integer.parseInt(st.nextToken()));
					break;
				case "all":
					all();
					break;
				case "empty":
					empty();
					break;
			}
		}

		System.out.println(sb);
	}

	private static void add(int x) {
		if (array[x] == 0) array[x] = 1;
	}

	private static void remove(int x) {
		if (array[x] == 1) array[x] = 0;
	}

	private static void check(int x) {
		sb.append(array[x]).append("\n");
	}

	private static void toggle(int x) {
		if (array[x] == 0) array[x] = 1;
		else array[x] = 0;
	}

	private static void all() {
		for (int i = 1; i <= 20; i++) {
			array[i] = 1;
		}
	}

	private static void empty() {
		for (int i = 1; i <= 20; i++) {
			array[i] = 0;
		}
	}
}
