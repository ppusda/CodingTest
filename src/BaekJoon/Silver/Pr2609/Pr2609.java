package BaekJoon.Silver.Pr2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr2609 {
    private static int GCD(int n, int k) {
        if(k == 0) {
            return n;
        }else{
            return GCD(k, n % k);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백으로 들어올 시 처리방법

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        // GCD 최대공약수 (유클리드 호제법)
        int gcd = GCD(num1, num2);

        // LCM 최소공배수
        int lcm = (num1 * num2) / gcd;

        // Result
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
