package Pr01.Pr08;

import java.util.Scanner;

public class Pr01_lr08 {
    private String solution(String inputText) {
        String answer = "NO";

        inputText = inputText.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(inputText).reverse().toString();

        if(inputText.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr08 pr = new Pr01_lr08();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.nextLine();

        System.out.println(pr.solution(inputText));
    }
}
