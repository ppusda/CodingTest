package Programmers.Lv1.Pr12917;

import java.util.Arrays;

public class Pr12917 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        sb.append(chars);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
