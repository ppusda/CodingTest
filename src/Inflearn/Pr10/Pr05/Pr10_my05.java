package Inflearn.Pr10.Pr05;

import java.util.Arrays;
import java.util.Scanner;

public class Pr10_my05 {

    static int n, m;
    static int[] dy;

    private int solution(int[] coin){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = coin[i]; j<=m; j++){
                dy[j]=Math.min(dy[j], dy[j-coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Pr10_my05 pr = new Pr10_my05();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m+1];
        System.out.println(pr.solution(arr));
    }
}
