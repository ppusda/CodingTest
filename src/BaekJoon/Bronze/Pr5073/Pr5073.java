package BaekJoon.Bronze.Pr5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr5073 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] array = new int[3];

		while (true) {
			st = new StringTokenizer(br.readLine(), " ");

			int check = 0;
			for (int i = 0; i < 3; i++) {
				int n = Integer.parseInt(st.nextToken());
				array[i] = n;
				check += n;
			}

			if (check == 0) break; // 0 0 0이 입력된 경우는 종료

			Arrays.sort(array);
			validTriangle(array);
		}
	}

	private static void validTriangle(int[] array) {
		if(array[0] + array[1] <= array[2]) { // 가장 긴 변의 길이가 나머지 두 변의 길이의 합보다 작은 경우는 삼각형이 되지 못함
			System.out.println("Invalid");
		}else if(array[0] == array[1] && array[1] == array[2]) { // 세 변이 모두 같은 경우
			System.out.println("Equilateral");
		}else if(array[0] == array[1] || array[1] == array[2] || array[0] == array[2]) { // 두 변의 길이만 같은 경우
			System.out.println("Isosceles");
		}else { // 세 변의 길이가 모두 다른 경우
			System.out.println("Scalene");
		}
	}
}
