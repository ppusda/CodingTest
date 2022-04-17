package Pr02.Pr03;

import java.util.Scanner;

public class Pr02_lr03 {
    private String solution(int inputNumber, int[] inputA, int[] inputB) {
        String answer = "";

        for (int i = 0; i < inputNumber; i++){
            if(inputA[i] == inputB[i]){
                answer += "D";
            }else if(inputA[i] == 1 && inputB[i] == 3){
                answer += "A";
            }else if(inputA[i] == 2 && inputB[i] == 1) {
                answer += "A";
            }else if(inputA[i] == 3 && inputB[i] == 2) {
                answer += "A";
            }else{
                answer += "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr03 pr = new Pr02_lr03();
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

        for (char str : pr.solution(inputNumber, inputA, inputB).toCharArray()) {
            System.out.println(str);
        }
    }
}
