package Inflearn.Pr02.Pr06;

import java.util.Scanner;

public class Pr02_my06 {
    private String solution(int inputNumber, int[] inputArr) {
        String answer = "";
        int max = 0;

        for(int j = 0; j < inputNumber; j++){
            StringBuilder tmp = new StringBuilder(String.valueOf(inputArr[j])).reverse();
            inputArr[j] = Integer.parseInt(tmp.toString());
            if (max < inputArr[j]){
                max = inputArr[j];
            }
        }

        int[] tmpArr = new int[max + 1];
        tmpArr[0] = 1;
        tmpArr[1] = 1;
        for(int p = 2; p < tmpArr.length; p++){
            if(tmpArr[p] == 0){
                for (int t = p*2; t < max + 1 ; t = t + p){
                    tmpArr[t] = 1;
                }
            }
        }

        for (int x : inputArr){
            if(tmpArr[x] == 0){
                answer += x + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr02_my06 pr = new Pr02_my06();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputArr = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            inputArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(inputNumber, inputArr));
    }
}
