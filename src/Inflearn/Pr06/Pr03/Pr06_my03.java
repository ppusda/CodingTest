package Inflearn.Pr06.Pr03;

import java.util.Scanner;

public class Pr06_my03 {
    private int[] solution(int number, int[] numArr) {
        int chk = 0;

        for(int i = 0; i < number; i++){
            for(int j = i; j < number-1; j++){
                if(numArr[j] > numArr[j+1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;

                    for(int k = 0; k < j; k++){
                        if(numArr[j] < numArr[k]) {
                            int temp = numArr[j];
                            numArr[j] = numArr[k];
                            numArr[k] = temp;
                        }
                    }
                }
            }
        }

        return numArr;
    }

    public static void main(String[] args) {
        Pr06_my03 pr = new Pr06_my03();
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
