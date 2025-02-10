package BaekJoon.Silver.Pr25757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Pr25757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		String game = st.nextToken();

		HashSet<String> hashSet = new HashSet<>();
		for (int i = 0; i < N; i++) {
			hashSet.add(br.readLine());
		}

		if (game.equals("Y")) {
			System.out.println(hashSet.size());
		} else if (game.equals("F")) {
			System.out.println(hashSet.size() / 2);
		} else if (game.equals("O")) {
			System.out.println(hashSet.size() / 3);
		}

	}
}
