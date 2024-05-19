package Programmers.Lv0.Pr120808;

import java.util.Arrays;

public class Pr120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom);

        return new int[] {numer/gcd, denom/gcd};
    }

    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Pr120808().solution(1, 5, 4, 5)));
    }
}
