package Pr01.Pr05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pr01_my05 {
    private boolean chkAlpahbet(String str){
        return Pattern.matches("^[a-zA-Z]$", str);
    }

    private String solution(String inputText) {
        String answer = "";

        char[] inputTextArray = inputText.toCharArray();

        int firstIdx = 0;
        int lastIdx = inputTextArray.length-1;

        while (firstIdx < lastIdx){
            String textA = String.valueOf(inputTextArray[firstIdx]);
            String textB = String.valueOf(inputTextArray[lastIdx]);
            if(!chkAlpahbet(textA)){
                firstIdx++;
                continue;
            }else if (!chkAlpahbet(textB)){
                lastIdx--;
                continue;
            }else {
                char tmp = inputTextArray[firstIdx];
                inputTextArray[firstIdx] = inputTextArray[lastIdx];
                inputTextArray[lastIdx] = tmp;
            }
            firstIdx ++;
            lastIdx --;
        }

        answer = String.valueOf(inputTextArray);

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my05 pr = new Pr01_my05();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }

    /**
     * 문제의 본질은 알파벳끼리만 뒤집으라는 것
     * kj#$stpj
     *
     * 위와 같은 문자열이 들어오면 특수문자는 그대로 있어야 하기때문에
     * index 값을 넘기고 contine를 통해 계속 진행하는 식으로 해결했다.
     *
     */
}
