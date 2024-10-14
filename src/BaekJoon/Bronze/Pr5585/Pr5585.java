package BaekJoon.Bronze.Pr5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        int[] coin = new int[] {500, 100, 50, 10, 5, 1};

        int count = 0;
        for (int c : coin) {
            if (n % c == 0) {
                count += n / c;
                break;
            }

            count += n / c;
            n = n % c;
        }

        System.out.println(count);
    }
}
