package Inflearn.Pr03.Pr04;

import java.util.Scanner;

public class Pr03_my04 {
    private int solution(int num, int tot, int[] numArr) {
        int answer = 0;

        int tail = 0, head = 1;

        int sum = numArr[tail] + numArr[head++];
        while (tail < num && head < num){
            if(sum == tot){
                answer++;
                sum += numArr[head++] - numArr[tail++];
            }else if(sum < tot){
                sum += numArr[head++];
            }else{
                sum -= numArr[tail++];
            }
        }
        if(sum == tot) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr03_my04 pr = new Pr03_my04();
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

