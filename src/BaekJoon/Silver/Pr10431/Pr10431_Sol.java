package BaekJoon.Silver.Pr10431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr10431_Sol {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int P = Integer.parseInt(br.readLine());

		for (int i = 0; i < P; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int testCase = Integer.parseInt(st.nextToken());

			int cnt = 0;
			int[] num = new int[20];

			for (int j = 0; j < 20; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}

			for (int j = 0; j < 20; j++) {
				for (int k = 0; k < j; k++) {
					if (num[k] > num[j]) cnt++;
				}
			}

			sb.append(testCase).append(" ").append(cnt).append("\n");
		}

		System.out.println(sb);
	}
}

// 실제로 정렬하며 구현해봤지만 실패...
// 학생이 뒤로 이동한 수는 앞에 키 큰 사람의 수와 같기에 수를 세어 출력