package Inflearn.Pr01.Pr06;

import java.util.*;

public class Pr01_lr06 {
    private String solution(String inputText) {
        String answer = "";

        for(int i = 0; i < inputText.length(); i++){
            if(inputText.indexOf(inputText.charAt(i)) == i){
                answer += inputText.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr06 pr = new Pr01_lr06();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
    /**
     *  charAt() 을 통해서 값을 가져오고,
     *  indexOf로 첫번째 index를 가져와
     *  증가하는 값인 i의 값과 같을 때만 answer에 더하는 구조이다.
     *
     *  간단하게 푸는게 참 신기하다.
     */
}