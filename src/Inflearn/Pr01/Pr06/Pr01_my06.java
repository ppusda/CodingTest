package Inflearn.Pr01.Pr06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pr01_my06 {
    private String solution(String inputText) {
        String answer = "";

        char[] inputTextArray = inputText.toCharArray();
        List<Character> chkTextList = new ArrayList<>();

        for(char x : inputTextArray){
            if(!chkTextList.contains(x)){
                chkTextList.add(x);
            }
        }

        answer = chkTextList.stream()
                .map(Object::toString)
                .collect(Collectors.joining("")).toString();

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my06 pr = new Pr01_my06();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
}