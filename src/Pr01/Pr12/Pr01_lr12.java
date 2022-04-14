package Pr01.Pr12;

import java.util.Scanner;

public class Pr01_lr12 {
    private String solution(int textLength, String inputText) {
        String answer = "";

        for(int i = 0; i < textLength; i++){
            String tmp = inputText.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            inputText = inputText.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr12 pr = new Pr01_lr12();
        Scanner sc = new Scanner(System.in);

        int textLength = sc.nextInt();
        String inputText = sc.next();

        System.out.println(pr.solution(textLength, inputText));
    }
}
