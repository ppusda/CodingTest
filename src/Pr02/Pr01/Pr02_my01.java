package Pr02.Pr01;

import java.util.Scanner;

public class Pr02_my01 {
    private String solution(String[] inputText) {
        String answer = inputText[0] + " ";

        for (int i = 1; i < inputText.length; i++){
            if(Integer.parseInt(inputText[i]) >= Integer.parseInt(inputText[i-1])){
                answer += inputText[i] + " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my01 pr = new Pr02_my01();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        String[] inputText = new String[inputNumber];
        for(int i = 0; i < inputNumber; i++){
            inputText[i] = sc.next();
        }

        System.out.println(pr.solution(inputText));
    }
}
