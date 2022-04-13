package Pr01.Pr11;

import java.util.Scanner;

public class Pr01_lr11 {
    private String solution(String inputText) {

        String answer = "";
        inputText = inputText + " ";

        int cnt = 1;

        for(int i = 0; i < inputText.length()-1; i ++){
            if(inputText.charAt(i) == inputText.charAt(i+1)){
                cnt ++;
            }else{
                answer += inputText.charAt(i);
                if(cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr11 pr = new Pr01_lr11();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }

}
