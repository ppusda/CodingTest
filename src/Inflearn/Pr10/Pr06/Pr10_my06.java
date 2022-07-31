package Inflearn.Pr10.Pr06;

import java.util.Scanner;

public class Pr10_my06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m+1];
        for(int i = 0; i < n; i++){
            int ps = sc.nextInt();
            int pt = sc.nextInt();
            for(int j = m; j >= pt; j--){
                dy[j] = Math.max(dy[j - pt] + ps, dy[j]);
                if(dy[j] > answer){
                    answer = dy[j];
                }
            }
        }

        System.out.println(answer);
    }
}
