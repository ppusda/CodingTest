package Pr06.Pr02;

import java.util.Scanner;

public class Pr06_my02 {
    private int[] solution(int number, int[] numArr) {
        int chk = 0;

        while (chk == 0){
            chk = 1;
            for(int i = 0; i < number-1; i ++){
                if(numArr[i] > numArr[i+1]){
                    int tmp = numArr[i];
                    numArr[i] = numArr[i+1];
                    numArr[i+1] = tmp;
                    chk = 0;
                }
            }
            if(chk == 1){
                break;
            }
        }

        return numArr;
    }

    public static void main(String[] args) {
        Pr06_my02 pr = new Pr06_my02();
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
}
