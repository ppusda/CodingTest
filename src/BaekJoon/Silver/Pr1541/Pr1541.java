package BaekJoon.Silver.Pr1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

        int answer = Integer.MAX_VALUE;
        while (sub.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

            while (add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }

            if (answer == Integer.MAX_VALUE) {
                answer = temp;
            } else {
                answer -= temp;
            }
        }

        System.out.println(answer);
    }
}
