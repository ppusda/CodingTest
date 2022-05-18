package Pr06.Pr02;

import java.util.Scanner;

public class Pr06_lr02 {
    private int[] solution(int number, int[] numArr) {

        for(int i = 0; i < number-1; i++){
            for(int j = 0; j < number-i-1; j ++){
                int tmp = numArr[j];
                numArr[j] = numArr[j+1];
                numArr[j+1] = tmp;
            }
        }

        return numArr;
    }

    public static void main(String[] args) {
        Pr06_lr02 pr = new Pr06_lr02();
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
