package BaekJoon.Bronze.Pr27433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr27433 {

    private static long[] memoization = new long[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        memoization[0] = 1;
        memoization[1] = 1;

        System.out.print(factorial(n));
    }

    private static long factorial(int n) {
        if (memoization[n] != 0) return memoization[n];
        return n * factorial(n-1);
    }
}
