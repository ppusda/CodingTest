package Pr01.Pr09;

import java.util.Scanner;

public class Pr01_my09 {
    private String removeWithoutNumber(String inputText){
        return inputText.replaceAll("[^0-9]", "");
    }

    private int solution(String inputText) {
        int answer = Integer.parseInt(removeWithoutNumber(inputText));

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my09 pr = new Pr01_my09();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
}
