package BaekJoon.Bronze.Pr23971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr23971 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int H = Integer.parseInt(st.nextToken()); // 세로
		int W = Integer.parseInt(st.nextToken()); // 가로
		int N = Integer.parseInt(st.nextToken()); // 세로 떨어져 앉아야하는 거리
		int M = Integer.parseInt(st.nextToken()); // 가로 떨어져 앉아야하는 거리

		System.out.println(calcSeats(H, N) * calcSeats(W, M));
	}

	private static int calcSeats(int length, int distance) {
		return ((length-1)/(distance+1))+1;
		// 처음으로 앉아있는 자리 제외 (-1 을 해야 해당 자리를 제외함)
		// 떨어져야 하는 거리 (+1 을 해야 그 다음 자리를 가리킴)
		// 제외한 앉아있던 사람 다시 추가 (+1)
	}
}
