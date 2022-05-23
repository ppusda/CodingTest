package Pr06.Pr06;

import java.util.Scanner;

public class Pr06_fa06 {
    private String solution(int taskLength, int[] task) {
        String answer = "";
        int changeMin = 0;
        int changeMax = 0;
        int chk = 0;

        for(int i = 1; i < taskLength-1; i++){
            if(chk == 0){
                if(task[i] < task[i-1]){
                    changeMax = i-1;
                    chk = 1;
                    i --;
                }
            }else{
                if(task[i] > task[i+1]){
                    changeMin = i+1;
                    break;
                }
            }
        }

        answer += (changeMax+1) + " " + (changeMin+1);
        return answer;
    }

    public static void main(String[] args) {
        Pr06_fa06 pr = new Pr06_fa06();
        Scanner sc = new Scanner(System.in);

        int taskLength= sc.nextInt();
        int[] task = new int[taskLength];
        for(int i = 0; i < taskLength; i ++){
            task[i] = sc.nextInt();
        }

        System.out.println(pr.solution(taskLength, task));
    }

}
