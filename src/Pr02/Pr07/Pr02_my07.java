package Pr02.Pr07;

import java.util.*;

public class Pr02_my07 {
    private Integer solution(int inputNumber, int[] inputArr) {
        int answer = 0;
        int cnt = 0;

        for(int x : inputArr){
            if(x == 1){
                answer += 1 + cnt;
                cnt++;
            }else{
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my07 pr = new Pr02_my07();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputArr = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            inputArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(inputNumber, inputArr));
    }

    /***
     * 풀이 코드와 동일하기에 lr은 스킵
     */
}