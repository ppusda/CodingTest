package BaekJoon.Silver.Pr11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for(int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine()); // 동전 종류 입력
        }

        int count = 0;

        for(int i = N - 1; i >= 0; i--) { // 큰 가치를 지닌 동전 부터 차례로
            if(coin[i] <= K) {
                count += (K / coin[i]); // 최대 개수 할당
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
