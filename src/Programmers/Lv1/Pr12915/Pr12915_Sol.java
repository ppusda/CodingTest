package Programmers.Lv1.Pr12915;

import java.util.Arrays;

public class Pr12915_Sol {
    public String[] solution(String[] strings, int n) {

        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(n);

            strings[i] = c + strings[i];
        }

        Arrays.sort(strings);

        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        String[] answer = strings;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new Pr12915_Sol().solution(
                                new String[]{"abce", "abcd", "cdx"},
                                2
                        )
                )
        );
    }
}
