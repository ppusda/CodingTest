package Inflearn.Pr06.Pr01;

import java.util.Scanner;

public class Pr06_lr01 {
    private int[] solution(int number, int[] numArr) {
        int cnt = 0;

        for(int i = 0; i < number-1; i ++){
            int idx = i;
            for(int j = i; j < number; j ++){
                if(numArr[j] < numArr[idx]){
                    idx = j;
                }
            }
            int tmp = numArr[i];
            numArr[i] = numArr[idx];
            numArr[idx] = tmp;
        }

        return numArr;
    }

    public static void main(String[] args) {
        Pr06_lr01 pr = new Pr06_lr01();
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] numArr = new int[number];
        for(int i = 0; i < number; i ++){
            numArr[i] = sc.nextInt();
        }

        for (int i : pr.solution(number, numArr)) {
            System.out.print(i + " ");
        }
    }
    /***
     * for의 마지막은 어차피 제일 큰값이기에 돌리지 않아도 된다.
     */
}
