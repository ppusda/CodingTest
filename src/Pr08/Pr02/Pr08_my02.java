package Pr08.Pr02;

import java.util.Scanner;

public class Pr08_my02 {
    static int answer = 0;
    static int n, max;
    static int[] arr;
    public void DFS(int index, int sum){
        if(sum >= n){
            return;
        }
        if(max > sum && sum > answer){
            answer = sum;
        }

        DFS(index+1, sum + arr[index]);
        DFS(index+1, sum);

    }

    public static void main(String[] args) {
        Pr08_my02 pr = new Pr08_my02();
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
