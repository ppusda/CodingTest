package Pr02.Pr08;

import java.util.Scanner;

public class Pr02_lr08 {
    private int[] solution(int inputNumber, int[] inputArr) {
        int[] answer = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            int cnt = 1;
            for (int j = 0; j < inputNumber; j++){
                if(inputArr[i] < inputArr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr08 pr = new Pr02_lr08();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputArr = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            inputArr[i] = sc.nextInt();
        }

        for (int x: pr.solution(inputNumber, inputArr)) {
            System.out.print(x + " ");
        }
    }
}
