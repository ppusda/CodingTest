package Inflearn.Pr06.Pr06;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_my06 {
    private String solution(int taskLength, int[] task) {
        String answer = "";

        int[] notSort = new int[taskLength];
        for(int i = 0; i < taskLength; i++){
            notSort[i] = task[i];
        }

        Arrays.sort(task);

        for(int i = 0; i < taskLength; i++){
            if(notSort[i] != task[i]){
                answer += (i+1) + " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr06_my06 pr = new Pr06_my06();
        Scanner sc = new Scanner(System.in);

        int taskLength= sc.nextInt();
        int[] task = new int[taskLength];
        for(int i = 0; i < taskLength; i ++){
            task[i] = sc.nextInt();
        }

        System.out.println(pr.solution(taskLength, task));
    }

}
