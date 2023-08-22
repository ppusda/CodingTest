package Programmers.Lv1.Pr12937;

public class Pr12937 {
    public String solution(int num) {
        String answer = "Odd";

        if(num % 2 == 0){
            answer = "Even";
        }

        return answer;
    }
}
