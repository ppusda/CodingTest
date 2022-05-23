package Pr06.Pr06;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_lr06 {
    private String solution(int taskLength, int[] task) {
        String answer = "";

        int[] notSort = task.clone();

        Arrays.sort(task);

        for(int i = 0; i < taskLength; i++){
            if(notSort[i] != task[i]){
                answer += (i+1) + " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr06_lr06 pr = new Pr06_lr06();
        Scanner sc = new Scanner(System.in);

        int taskLength= sc.nextInt();
        int[] task = new int[taskLength];
        for(int i = 0; i < taskLength; i ++){
            task[i] = sc.nextInt();
        }

        System.out.println(pr.solution(taskLength, task));
    }

    /**
     * Clone 이라는 복사 함수가 있음...
     */
}
