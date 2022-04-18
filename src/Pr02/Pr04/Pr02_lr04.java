package Pr02.Pr04;

import java.util.Scanner;

public class Pr02_lr04 {
    private void solve(int inputNumber) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<inputNumber; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    /**
     * 위는 손코딩 방법
     *
     * 아래는 for문 이용 방법
     */

    private int[] solution(int inputNumber) {
        int[] answer = new int[inputNumber];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < inputNumber; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr04 pr = new Pr02_lr04();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        for (int x : pr.solution(inputNumber)){
            System.out.print(x + " ");
        }

        pr.solve(inputNumber);
    }


}
