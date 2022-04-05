package Pr01.Pr03;

import java.util.Scanner;

public class Pr01_my03 {
    private String solution(String inputText) {
        String answer = "";
        String[] inputArray = inputText.split(" ");;

        answer = inputArray[0];

        for(int i = 1; i < inputArray.length; i++){
            if(answer.length() < inputArray[i].length()){
                answer = inputArray[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my03 pr = new Pr01_my03();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.nextLine();

        System.out.println((pr.solution(inputText)));
    }
}
