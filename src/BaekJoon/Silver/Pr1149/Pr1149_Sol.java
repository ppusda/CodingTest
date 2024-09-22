package BaekJoon.Silver.Pr1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1149_Sol {

    private static int N;
    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        array = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
            array[i][2] = Integer.parseInt(st.nextToken());
        }


        for (int i = 1; i < N; i++) { // 반복문 방식, Bottom-up이다.
            array[i][0] += Math.min(array[i - 1][1], array[i - 1][2]); // 현재 집이 R일 경우 이전 집의 G일 때의 가중치와 B일 때의 가중치 중 작은 값을 더한다.
            array[i][1] += Math.min(array[i - 1][0], array[i - 1][2]); // 현재 집이 G일 경우 이전 집의 R일 때의 가중치와 B일 때의 가중치 중 작은 값을 더한다.
            array[i][2] += Math.min(array[i - 1][0], array[i - 1][1]); // 현재 집이 B일 경우 이전 집의 R일 때의 가중치와 G일 때의 가중치 중 작은 값을 더한다.
        }

        System.out.println(Math.min(Math.min(array[N - 1][0], array[N - 1][1]), array[N - 1][2])); // 최종에서 최소값을 찾아 출력
    }
}
