package BaekJoon.Silver.Pr1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] arr = new int[1001];
        int idx = 1;
        int val = 1;
        int res = 0;

        for (int i = 0; i <= 1000; i++) {
            for (int j = val; j > 0; j--) {
                if (arr[idx] == 0) {
                    arr[idx] = val;
                }
                idx++;
                if(idx == 1001) {
                    break;
                }
            }
            if(idx == 1001) {
                break;
            }
            val++;
        }

        for (int i = start; i <= end; i++){
            res += arr[i];
        }

        System.out.println(res);
    }
}
