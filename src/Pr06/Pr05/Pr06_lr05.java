package Pr06.Pr05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pr06_lr05 {
    private String solution(int taskLength, int[] task) {
        String answer = "U";

        Arrays.sort(task);
        for(int i = 0; i < taskLength-1; i ++){
            if(task[i] == task[i+1]){
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr06_lr05 pr = new Pr06_lr05();
        Scanner sc = new Scanner(System.in);

        int taskLength= sc.nextInt();
        int[] task = new int[taskLength];
        for(int i = 0; i < taskLength; i ++){
            task[i] = sc.nextInt();
        }

        System.out.println(pr.solution(taskLength, task));
    }
}
