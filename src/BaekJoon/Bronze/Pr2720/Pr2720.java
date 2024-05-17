// Baekjoon: 2720_세탁소 사장 동혁
package BaekJoon.Bronze.Pr2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2720 {

    private final static int[] array = new int[] {25, 10, 5, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < time; i++) {
            int money = Integer.parseInt(br.readLine());
            for (int n: array) {
                sb.append(money / n).append(" ");
                money %= n;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
// 그리디 연습