package Pr06.Pr05;

import Pr06.Pr04.Pr06_my04;

import java.util.*;

public class Pr06_my05 {
    private String solution(int taskLength, int[] task) {
        String answer = "D";

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < taskLength; i++){
            set.add(task[i]);
        }

        if(set.size() == taskLength){
            answer = "U";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr06_my05 pr = new Pr06_my05();
        Scanner sc = new Scanner(System.in);

        int taskLength= sc.nextInt();
        int[] task = new int[taskLength];
        for(int i = 0; i < taskLength; i ++){
            task[i] = sc.nextInt();
        }

        System.out.println(pr.solution(taskLength, task));
    }
}
