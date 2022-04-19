package Pr02.Pr05;

import java.util.Scanner;

public class Pr02_lr05 {
    private Integer solution(int inputNumber) {
        int answer = 0;
        int[] numList = new int[inputNumber + 1];

        for (int i = 2; i <= inputNumber; i++){
            if(numList[i] == 0){
                answer ++;
                for (int j = i; j <= inputNumber; j = j+i){
                    numList[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr05 pr = new Pr02_lr05();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        System.out.println(pr.solution(inputNumber));
    }

    /***
     * timeout을 해결하기 위해
     * j가 되는 값이 i의 배수가 될 수 있도록 하였다.
     * j = i;
     * j = j + i;
     *
     * 이로 인해 계산이 더 간단해졌다.
     *
     * 앞으로는 계산에 대한 시간을 좀 더 생각해보고 코드를 짜야겠다.
     *
     */
}
