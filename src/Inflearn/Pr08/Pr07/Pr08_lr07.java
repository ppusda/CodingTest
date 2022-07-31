package Inflearn.Pr08.Pr07;

import java.util.*;

public class Pr08_lr07 {
    private static int answer = 0;
    private static int[][] chk = new int[35][35]; // 최대 값 설정

    private int DFS(int n, int r) {
        if (chk[n][r] > 0){
            return chk[n][r];
        }
        if(n == r || r == 0){
            return 1; // 3C3 혹은 3C0 같은 경우는 1이기에
        }else{
            return chk[n][r] = DFS(n-1, r-1) + DFS(n-1, r); // 조합 수 계산 결과 return
        }
    }

    public static void main(String[] args) {
        int n, r;
        Pr08_lr07 pr = new Pr08_lr07();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println(pr.DFS(n, r));
    }
}