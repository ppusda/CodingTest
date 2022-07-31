package Inflearn.Pr01.Pr10;

import java.util.*;

public class Pr01_my10 {
    private String solution(String inputText, char text) {
        StringBuilder answer = new StringBuilder();

        List<Integer> textDistanceList = new ArrayList();

        for (int s = 0; s < inputText.length(); s++){
            textDistanceList.add(inputText.length());
        }
        for(int i = 0; i < inputText.length(); i++){

            if (inputText.charAt(i) == text){
                for(int j = 0; j < inputText.length(); j++){
                    if(textDistanceList.get(j) > Math.abs(i-j)){
                        textDistanceList.set(j, Math.abs(i-j));
                    }
                }
            }
        }

        for (int str : textDistanceList){
            answer.append(str).append(" ");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Pr01_my10 pr = new Pr01_my10();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();
        char text = sc.next().charAt(0);

        System.out.println(pr.solution(inputText, text));
    }

}