package Programmers.Lv1.Pr12918;

import java.util.regex.Pattern;

public class Pr12918 {
    public static boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            return Pattern.matches("[0-9]+", s);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }
}
