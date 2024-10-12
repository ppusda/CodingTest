package BaekJoon.Silver.Pr1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Pr1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        StringTokenizer st;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                if (i == 0) a[j] = Integer.parseInt(st.nextToken());
                if (i == 1) b[j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (a[i] * b[i]);
        }

        System.out.println(answer);
    }
}
