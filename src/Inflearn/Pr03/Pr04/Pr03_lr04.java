package Inflearn.Pr03.Pr04;

import java.util.Scanner;

public class Pr03_lr04 {
    private int solution(int num, int tot, int[] numArr) {
        int answer = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < num; rt++){
            sum += numArr[rt];
            if(sum == tot) {
                answer ++;
            }
            while (sum >= tot) {
                sum -= numArr[lt++];
                if(sum == tot) {
                    answer ++;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Pr03_lr04 pr = new Pr03_lr04();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int tot = sc.nextInt();
        int[] numArr = new int[num];
        for(int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(num, tot, numArr));
    }
}
