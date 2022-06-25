package Pr08.Pr05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr08_my05 {
    static int answer = 0;
    static int arrLength, total;
    static int[] arr;

    public void BFS(int level){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int qNum = queue.poll();
                for(int n : arr){
                    int res = qNum + n;
                    if(res == total){
                        answer = level+1;
                        return;
                    }
                    if(total > res){
                        queue.offer(res);
                    }
                }
            }
            level ++;
        }
    }

    public static void main(String[] args) {
        Pr08_my05 pr = new Pr08_my05();
        Scanner sc = new Scanner(System.in);

        arrLength = sc.nextInt();
        arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = sc.nextInt();
        }
        total = sc.nextInt();

        pr.BFS(0);
        System.out.println(answer);
    }

}
