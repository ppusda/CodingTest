package BaekJoon.Pr2501;

import java.util.*;

public class Pr2501_Sol {

    private static int n, k;
    private static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }
            //k번째 약수이면 i 출력
            if (k == 0) {
                System.out.print(i);
                return;
            }
        }
        //k번째 약수가 없으면 0 출력
        System.out.print(0);

    }
}
