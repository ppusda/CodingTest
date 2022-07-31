package Inflearn.Pr08.Pr01;

import java.util.Scanner;

public class Pr08_lr01 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr){
        if(flag){
            return;
        }
        if(L == n){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);

        }

    }

    public static void main(String[] args) {
        Pr08_lr01 pr = new Pr08_lr01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        pr.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
