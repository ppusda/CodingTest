package Inflearn.Pr06.Pr04;

import java.util.Scanner;

public class Pr06_lr04 {
    private int[] solution(int cacheLength, int taskLength, int[] task) {
        int[] cache = new int[cacheLength];

        for(int x : task){
            int pos = -1; // index num
            for(int i = 0; i < cacheLength; i++){
                if(x == cache[i]){
                    pos = i;
                }
            }
            if(pos == -1){
                for (int i = cacheLength-1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }else{
                for (int i = pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    public static void main(String[] args) {
        Pr06_lr04 pr = new Pr06_lr04();
        Scanner sc = new Scanner(System.in);

        int cacheLength = sc.nextInt();
        int taskLength= sc.nextInt();
        int[] task = new int[taskLength];
        for(int i = 0; i < taskLength; i ++){
            task[i] = sc.nextInt();
        }

        for (int i : pr.solution(cacheLength, taskLength, task)) {
            System.out.print(i + " ");
        }
    }
}
