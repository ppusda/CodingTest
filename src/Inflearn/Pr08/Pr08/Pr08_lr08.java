package Inflearn.Pr08.Pr08;

import java.util.Scanner;

public class Pr08_lr08 {
    private static String answer = "";
    private static int max, target;
    private static int[] combination, chk, arr;
    private static int[][] dy = new int[35][35];
    private static boolean state = true;

    private static int combi(int n, int r){
        if(dy[n][r] > 0){
            return dy[n][r];
        }else{
            if(n == r || r == 0){
                return 1;
            }else{
                return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
            }
        } // 수열 구하기 기억하자.
    }

    private static void DFS(int index, int sum){
        if (!state){
            return;
        }
        if(index == max){
            if(sum == target){
                for (int x : arr){
                    System.out.print(x + " ");
                }
                state = false;
            }
        }else{
            for(int i = 1; i <= max; i++){
                if(chk[i] == 0){
                    chk[i] = 1;
                    arr[index] = i;
                    DFS(index+1, sum+(arr[index] * combination[index]));
                    chk[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr08_lr08 pr = new Pr08_lr08();
        Scanner sc = new Scanner(System.in);

        max = sc.nextInt();
        target = sc.nextInt();

        combination = new int[max];
        arr = new int[max];
        chk = new int[max+1];
        for(int i = 0; i < max; i++){
            combination[i] = combi(max-1, i);
        }

        pr.DFS(0, 0);
    }
}
