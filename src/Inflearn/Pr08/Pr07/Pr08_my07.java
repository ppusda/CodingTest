package Inflearn.Pr08.Pr07;

import java.util.Scanner;

public class Pr08_my07 {
    private static int answer = 0;
    private static int[][] chk;

    private void DFS(int n, int r) {
        if(n <= 0 || r < 0){
            return;
        }
        if(chk[n][r] == 1){
            return;
        }else{
            chk[n][r] = 1;
            answer ++;
            DFS(n-1, r-1);
            DFS(n-1, r);
        }

    }

    public static void main(String[] args) {
        int n, r;
        Pr08_my07 pr = new Pr08_my07();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();

        chk = new int[n+1][r+1];

        pr.DFS(n, r);
        System.out.println(answer);
    }
}

/**
 * 문제를 잘못 이해하였다.
 * 3C5 하위의 수열의 개수를 구하는 것인줄 알았는데,
 * 조합식의 계산 결과를 재귀를 이용하여 푸는 것이었다.
 *
 * lr에서 살펴보자.
 */
