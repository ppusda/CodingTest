package BaekJoon.Bronze.Pr2309;

import java.util.*;
import java.io.*;

public class Pr2309_Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9]; // 9개 입력이 확실하면 고정
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}

// 브루트 포스 (brute force)
// 무식하게 가능한 경우를 찾는 것을 의미한다.
// 전체 값에서 뺀 값을 찾아내는 식으로 코드를 짜는 것 같다.