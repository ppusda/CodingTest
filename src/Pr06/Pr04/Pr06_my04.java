package Pr06.Pr04;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pr06_my04 {
    private List<Integer> solution(int cacheLength, int taskLength, int[] task) {

        List<Integer> cache = new LinkedList<>();

        for(int i = 0; i < taskLength; i++){
            for(int j = 0; j < cacheLength; j++){
                if(cache.contains(task[i])){
                    cache.remove((Object)task[i]);
                }else if(cache.size() == cacheLength && !cache.contains(task[i])){
                    cache.remove(0);
                }
                cache.add(task[i]);
            }
        }

        Collections.reverse(cache);

        return cache;
    }

    public static void main(String[] args) {
        Pr06_my04 pr = new Pr06_my04();
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
