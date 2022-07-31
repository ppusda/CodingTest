package Inflearn.Pr02.Pr02;

import java.util.Scanner;

public class Pr02_my02 {
    private int solution(int inputNumber, int[] inputStature) {
        int answer = 1;
        int max = inputStature[0];

        for (int i = 1; i < inputNumber; i++){
            if(max < inputStature[i]){
                max = inputStature[i];
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my02 pr = new Pr02_my02();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputStature = new int[inputNumber];
        for(int i = 0; i < inputNumber; i++){
            inputStature[i] = sc.nextInt();
        }

        System.out.println(pr.solution(inputNumber, inputStature));
    }

    /**
     * 풀이와 거의 동일하기에
     * 오늘의 lr 은 스킵
     */
}
