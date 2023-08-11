package Programmers.Lv2.Pr12951;

public class Pr12951_Sol {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ");
        }

        return answer;
    }
}
