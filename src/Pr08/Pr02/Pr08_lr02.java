package Pr08.Pr02;

import java.util.Scanner;

public class Pr08_lr02 {
    static int answer = 0;
    static int n, max;
    static int[] arr;
    public void DFS(int index, int sum){
        if(sum > max){
            return;
        }
        if(index == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(index+1, sum + arr[index]);
            DFS(index+1, sum);
        }
    }

    public static void main(String[] args) {
        Pr08_lr02 pr = new Pr08_lr02();
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        pr.DFS(0, 0);
        System.out.println(answer);
    }
}
