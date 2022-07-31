package Inflearn.Pr01.Pr02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr01_my02 {
    private String solution(String inputText) {

        List answer = new ArrayList();

        for(char it : inputText.toCharArray()){
            if (Character.isUpperCase(it)){
                answer.add(Character.toLowerCase(it));
            }else{
                answer.add((Character.toUpperCase(it)));
            }
        }

        inputText = "";
        for (int i = 0; i < answer.size(); i++){
            inputText += answer.get(i);
        }

        return inputText;
    }

    public static void main(String[] args) {
        Pr01_my02 pr = new Pr01_my02();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println((pr.solution(inputText)));
    }
}