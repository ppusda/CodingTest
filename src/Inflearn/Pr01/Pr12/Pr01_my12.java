package Inflearn.Pr01.Pr12;

import java.util.Scanner;

public class Pr01_my12 {
    private String solution(int textLength, String inputText) {
        String answer = "";

        inputText = inputText.replaceAll("#", "1");
        inputText = inputText.replaceAll("\\*", "0");

        char[] textList = new char[textLength];
        int cnt = 0;

        for(int i = 0; i < textLength; i ++){
            textList[i] = (char)(Integer.parseInt(inputText.substring(cnt, cnt+7), 2));
            cnt += 7;
        }

        for (char x: textList) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my12 pr = new Pr01_my12();
        Scanner sc = new Scanner(System.in);

        int textLength = sc.nextInt();
        String inputText = sc.next();

        System.out.println(pr.solution(textLength, inputText));
    }
}
