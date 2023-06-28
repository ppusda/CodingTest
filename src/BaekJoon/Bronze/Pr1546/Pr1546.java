package BaekJoon.Bronze.Pr1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double res = 0;
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            max = Math.max(max, input);
            arr[i] = input;
        }

        for(int i = 0; i < n; i++) {
            double tmp = ((double) arr[i]/ (double) max) * 100.0;
            res += tmp;
        }

        System.out.println(res/n);
    }
}
