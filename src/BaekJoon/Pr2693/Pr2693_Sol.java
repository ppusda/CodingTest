package BaekJoon.Pr2693;

import java.io.*;
import java.util.*;

public class Pr2693_Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());  //테스트 케이스 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);  //배열 오름차순으로 정렬하기
            sb.append(arr[7] + "\n");  //3번째로 큰 수
        }
        System.out.print(sb);
    }
}

/***
 * ArrayList 를 이용한 것이아닌 StringBuilder를 이용하여 출력문자를 축적시켰다.
 * 좋은 아이디어인 것 같다.
 */
