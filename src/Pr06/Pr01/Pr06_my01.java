package Pr06.Pr01;

import java.util.Scanner;

public class Pr06_my01 {
    private int[] solution(int number, int[] numArr) {
        int cnt = 0;

        while (cnt < number){
            int tmp = 0;
            int min = numArr[cnt];
            int minCnt = 0;
            for(int j = cnt; j < number; j++){
                if(min > numArr[j]){
                    minCnt = j;
                    min = numArr[j];
                }
            }
            if(minCnt != 0){
                tmp = numArr[minCnt];
                numArr[minCnt] = numArr[cnt];
                numArr[cnt] = tmp;
            }
            cnt++;
        }

        return numArr;
    }

    public static void main(String[] args) {
        Pr06_my01 pr = new Pr06_my01();
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
