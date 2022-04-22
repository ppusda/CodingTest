package Pr02.Pr09;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Pr02_lr09 {
    private int solution(int inputNumber, int[][] inputArr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i =0; i < inputNumber; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < inputNumber; j++){
                sum1 += inputArr[i][j];
                sum2 += inputArr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1=sum2=0;
        for (int i = 0; i < inputNumber; i ++){
            sum1 += inputArr[i][i];
            sum2 += inputArr[i][inputNumber-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr09 pr = new Pr02_lr09();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[][] inputArr = new int[inputNumber][inputNumber];

        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < inputNumber; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(inputNumber, inputArr));
    }

    /***
     * max 값을 갱신하는 것으로 코드가 짜여짐.
     * 굳이 리스트가 아니어도 되겠네..
     */
}
