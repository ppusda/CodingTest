// Baekjoon: 10162_전자레인지
package BaekJoon.Bronze.Pr10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr10162 {

    private final static int[] array = new int[] {300, 60, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int n : array) {
            sb.append(time / n).append(" ");
            time %= n;
        }

        if (time != 0) {
            System.out.println("-1");
            return;
        }

        System.out.println(sb);
    }
}
// 그리디 연습 문제