package BaekJoon.Silver.Pr1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr1205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		if (N != 0) st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		pq.add(score);

		int answer = 1, index = 0, cnt = 1;
		while (!pq.isEmpty()) {
			int now = pq.poll();
			index ++;
			if (pq.peek() != null && pq.peek() == now) {
				cnt ++;
				continue;
			}
			if (now == score) {
				break;
			}

			if (cnt != 1) {
				answer += cnt;
				cnt = 1;
			}
			else answer++;
		}

		if (index > P) System.out.println("-1");
		else System.out.println(answer);
	}
}
