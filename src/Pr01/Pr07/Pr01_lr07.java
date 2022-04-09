package Pr01.Pr07;

import java.util.Scanner;

public class Pr01_lr07 {
    private String solution(String inputText) {
        inputText = inputText.toUpperCase();
        int len = inputText.length();
        for(int i =0; i<len/2; i++){
            if(inputText.charAt(i)!=inputText.charAt(len-i-1)){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Pr01_lr07 pr = new Pr01_lr07();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
}
