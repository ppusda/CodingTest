package BaekJoon.Silver.Pr13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] oil = new long[N-1];
        long[] city = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N-1; i++) {
            oil[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            city[i] = Long.parseLong(st.nextToken());
        }

        long answer = city[0] * oil[0];
        long prev = city[0];
        for (int i = 1; i < N-1; i++) {
            if (prev > city[i]) {
                prev = city[i];
            }

            answer += prev * oil[i];
        }

        System.out.println(answer);
    }
}
