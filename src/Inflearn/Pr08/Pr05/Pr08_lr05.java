package Inflearn.Pr08.Pr05;

import java.util.Scanner;

public class Pr08_lr05 {
    static int answer = Integer.MAX_VALUE;
    static int arrLength, total;
    static int[] arr;

    public void DFS(int level, int sum){
        if(sum > total){
            return;
        }
        if(sum == total){
            answer = Math.min(answer, level);
        }else{
            for(int i = 0; i < arrLength; i++){
                DFS(level+1, sum+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Pr08_lr05 pr = new Pr08_lr05();
        Scanner sc = new Scanner(System.in);
        arrLength = sc.nextInt();
        arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = sc.nextInt();
        }
        total = sc.nextInt();
        pr.DFS(0, 0);
        System.out.println(answer);
    }

}
