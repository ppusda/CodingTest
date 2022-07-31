package Inflearn.Pr01.Pr08;

import java.util.Scanner;

public class Pr01_my08 {
    private String removeWithoutAlphabet(String inputText){
        return inputText.replaceAll("[^a-zA-Z]", "");
    }

    private String solution(String inputText) {
        String answer = "";

        inputText = removeWithoutAlphabet(inputText);
        String reverseText = new StringBuilder(inputText).reverse().toString();

        if(reverseText.equalsIgnoreCase(inputText)){
            answer = "YES";
        }else{
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my08 pr = new Pr01_my08();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.nextLine();

        System.out.println(pr.solution(inputText));
    }
}
