package Programmers.Lv2.Pr12951;

public class Pr12951 {
    public String solution(String s) {
        String answer = "";

        for(String str: s.split(" ")){
            if(str.length() == 0){
                answer += " ";
            } else {
                answer += str.substring(0, 1).toUpperCase();
                answer += str.substring(1).toLowerCase();
                answer += " ";
            }

        }

        if(s.charAt(s.length() - 1) == ' '){
            return answer;
        }

        return answer.substring(0, answer.length()-1);
    }
}
