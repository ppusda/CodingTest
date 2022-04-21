package Pr02.Pr08;

import java.util.*;

public class Pr02_my08 {
    private int[] solution(int inputNumber, int[] inputArr) {
        int[] answer = new int[inputNumber] ;

        for(int i = 0; i < inputNumber-1; i++){
            for (int j = i+1; j < inputNumber; j++){
                if(inputArr[i] == inputArr[j]){
                    continue;
                }
                if(inputArr[i] > inputArr[j]){
                    answer[j] += 1;
                }else if(inputArr[i] < inputArr[j]){
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my08 pr = new Pr02_my08();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputArr = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            inputArr[i] = sc.nextInt();
        }

        for (int x: pr.solution(inputNumber, inputArr)) {
            System.out.print(x+1 + " ");
        }
    }

}