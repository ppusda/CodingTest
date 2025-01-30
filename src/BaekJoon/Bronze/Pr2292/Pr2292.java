package BaekJoon.Bronze.Pr2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long calc = 1;
		int count = 1;
		while (calc < N) {
			calc += count++ * 6L;
		}

		System.out.println(count);
	}
}
