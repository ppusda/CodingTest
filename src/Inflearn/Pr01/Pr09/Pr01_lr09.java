package Inflearn.Pr01.Pr09;

import java.util.Scanner;

public class Pr01_lr09 {
    private int solution(String inputText) {
        String answer = "";
        for(char x : toString().toCharArray()){
//            if(x >= 48 && x <= 57){
//                answer = answer*10+(x-48);
//            }
            if(Character.isDigit(x)){
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Pr01_lr09 pr = new Pr01_lr09();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
}
