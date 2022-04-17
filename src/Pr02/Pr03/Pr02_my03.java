package Pr02.Pr03;

import java.util.Scanner;

public class Pr02_my03 {

    private String[] solution(int inputNumber, int[] inputA, int[] inputB) {
        String[] answer = new String[inputNumber];

        for (int i = 0; i < inputNumber; i++){
            if(inputA[i] > inputB[i]){
                if(inputA[i] == 3 && inputB[i] == 1){
                    answer[i] = "B";
                }else{
                    answer[i] = "A";
                }
            }else if(inputA[i] < inputB[i]){
                if(inputB[i] == 3 && inputA[i] == 1){
                    answer[i] = "A";
                }else{
                    answer[i] = "B";
                }
            }else{
                answer[i] = "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my03 pr = new Pr02_my03();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputA = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inputA[i] = sc.nextInt();
        }
        int[] inputB = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inputB[i] = sc.nextInt();
        }


        for (String str : pr.solution(inputNumber, inputA, inputB)) {
            System.out.println(str);
        }
    }
}
