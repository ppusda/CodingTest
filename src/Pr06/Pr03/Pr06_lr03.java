package Pr06.Pr03;

import java.util.Scanner;

public class Pr06_lr03 {
    private int[] solution(int number, int[] numArr) {

        for(int i = 1; i < number; i++){
            int tmp = numArr[i], j;
            for(j = i-1; j >= 0; j--){
                if(numArr[j] > tmp){
                    numArr[j+1] = numArr[j];
                }else{
                    break;
                }
            }
            numArr[j+1] = tmp;
        }

        return numArr;
    }

    public static void main(String[] args) {
        Pr06_lr03 pr = new Pr06_lr03();
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
