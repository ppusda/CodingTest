package Inflearn.Pr02.Pr11;

import java.util.Scanner;

public class Pr02_my11 {
    private int solution(int inputNumber, int[][] inputArr) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < inputNumber; i++){
            int cnt = 0;
            for(int j = 0; j < inputNumber; j++){
                if(i != j){
                    for (int k = 0; k < 5; k++){
                        if(inputArr[i][k] == inputArr[j][k]){
                            cnt ++;
                            break;
                        }
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        return answer+1;
    }

    public static void main(String[] args) {
        Pr02_my11 pr = new Pr02_my11();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[][] inputArr = new int[inputNumber][5];

        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < 5; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(inputNumber, inputArr));
    }
}
