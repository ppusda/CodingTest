package Inflearn.Pr02.Pr04;

import java.util.Scanner;

public class Pr02_my04 {
    private String solution(int inputNumber) {
        int firstNum = 1;
        int nextNum = 1;
        String answer = firstNum + " " + nextNum + " ";

        for (int i = 0; i < inputNumber-2; i++){
            int tmp = nextNum;
            nextNum = firstNum + nextNum;
            firstNum = tmp;
            answer += nextNum + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my04 pr = new Pr02_my04();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        System.out.println(pr.solution(inputNumber));
    }
}
