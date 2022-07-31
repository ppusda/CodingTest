package Inflearn.Pr02.Pr05;

import java.util.Scanner;

public class Pr02_my05 {
    private Integer solution(int inputNumber) {
        int answer = 0;
        int[] numList = new int[inputNumber + 1];

        for (int i = 2; i < numList.length; i++){
            if(numList[i] == 0){
                answer ++;
                for (int j = 2; j < numList.length; j++){
                    if(j % i == 0){
                        numList[j] = 1;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr02_my05 pr = new Pr02_my05();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        System.out.println(pr.solution(inputNumber));
    }
    /***
     * timeout이 발생하였다.
     * 값은 제대로 나오나, 전체 탐색으로 인해 시간이 너무 오래 걸린다.
     */
}
