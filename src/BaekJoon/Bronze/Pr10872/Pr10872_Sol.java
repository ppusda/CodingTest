package BaekJoon.Bronze.Pr10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr10872_Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = factorial(n);

        System.out.print(sum);
    }

    public static int factorial(int N) {
        if(N <= 1) return 1;	// 재귀 종료조건
        return N * factorial(N - 1);
    }
}
// 재귀로 구현