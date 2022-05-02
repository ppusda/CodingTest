package Pr03.Pr06;

import java.util.Scanner;

public class Pr03_my06 {

    private int solution(int num, int ctt, int[] numArr) {
        int max = 0, head = 0, tail = 0;

        int sum = 0;
        int chk = 0;
        int state = 0;

        while (head < num){
            if(chk < ctt){
                if(numArr[head] == 0){
                    chk ++;
                    sum += numArr[head++];
                }else {
                    sum += numArr[head++];
                }
            }else {
                if(state == 1){
                    if(numArr[tail] == 0){
                        chk --;
                        state = 0;
                        sum -= numArr[tail++];
                    }else{
                        sum -= numArr[tail++];
                    }
                }
            }

            if(chk == ctt && state == 0){
                int sumTmp = sum;
                int tmp = head;
                while (tmp < num && numArr[tmp] == 1){
                    sum += numArr[tmp++];
                }

                if(max < sum+chk){
                    max =  sum+chk;
                }
                state = 1;
                sum = sumTmp;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Pr03_my06 pr = new Pr03_my06();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ctt = sc.nextInt();
        int[] numArr = new int[num];
        for(int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(num, ctt, numArr));
    }
}
