package BaekJoon.Silver.Pr6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr6603 {

    private static int[] array;
    private static boolean[] check;
    private static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            K = Integer.parseInt(st.nextToken());
            if (K == 0) {
                break;
            }

            array = new int[K];
            check = new boolean[K];

            for (int i = 0; i < K; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            DFS(0, 0);
            System.out.println();
        }
    }

    private static void DFS(int depth, int index) {
        if (depth == 6) {
            for (int i = 0; i < K; i++) {
                if (check[i]) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = index ; i < K; i++) {
            check[i] = true;
            DFS(depth+1, i+1);
            check[i] = false;
        }
    }
}
