package BaekJoon.Silver.Pr1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr1789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());

		long num = 1; // 연속되는 수
		long sum = 0; // 연속되는 수의 누적 합
		while(true) {
			sum += num;
			if(sum > S) break;
			num ++;
		}
		System.out.println(num-1);
	}
}
