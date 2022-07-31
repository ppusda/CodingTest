package Inflearn.Pr10.Pr02;

import java.util.Scanner;

public class Pr10_Pr02 {

    private static int[] dy;

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n] + dy[n-1];
    }

    public static void main(String[] args) {
        Pr10_Pr02 pr = new Pr10_Pr02();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(pr.solution(n));
    }
}

/**
 * 마지막 까지 간다고 건너간 것이 아니다.
 * 다음 경우의 수 까지 구해야만 한다.
 */
