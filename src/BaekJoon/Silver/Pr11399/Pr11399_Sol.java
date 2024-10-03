package BaekJoon.Silver.Pr11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr11399_Sol {

    private static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

       array = new int[1001];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // Counting Sort
        while (N-- > 0) {
            array[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0;	// 이전까지의 대기시간 누적합
        int sum = 0;	// 사람별 대기시간 총합

        for (int i = 0; i < 1001; i++) {

            // 해당 i index가 0이 될 때 까지 반복
            while (array[i]-- > 0) {
                // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
                sum += (i + prev);

                // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
                prev += i;
            }
        }
        System.out.println(sum);

    }
}

/***
 * 아무래도 한 가지 유형의 문제를 오래 풀다보니 그 쪽으로만 생각이 되는 문제가 있는 것 같다.
 * 다른 방법이 잘 생각나지 않았다. 물론, 틀린건 아니지만 여러모로 고민이 많아진다.
 */