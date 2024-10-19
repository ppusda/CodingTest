package BaekJoon.Silver.Pr2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Pr2217 {

    private static Integer[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        array = new Integer[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array, Comparator.reverseOrder());

        int answer = 0;
        int weight = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            weight = Math.min(weight, array[i]);
            answer = Math.max(answer, weight*(i+1));
        }

        System.out.println(answer);
    }
}
