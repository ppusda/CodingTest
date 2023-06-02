package BaekJoon.Pr10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr10870 {
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n));
    }

}
/***
 * StringTokenizer 는 입력받은 문자열을 쪼갤 때 사용된다.
 * 일반 int만 입력받을 때는 BufferedReader만 사용해도 무방함.
 */
