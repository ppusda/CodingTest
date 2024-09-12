package BaekJoon.Silver.Pr2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr2559 {

    private static int N, K;
    private static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        array = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        int start = 0;
        int end = K-1;
        while (end < array.length) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += array[i];
            }
            max = Math.max(max, sum);

            start++;
            end++;
        }

        System.out.println(max);
    }
}
