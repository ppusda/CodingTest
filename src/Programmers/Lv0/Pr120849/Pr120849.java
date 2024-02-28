package Programmers.Lv0.Pr120849;

import java.util.Arrays;

public class Pr120849 {
    public String solution(String my_string) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};

        for (String vowel : vowels) {
            my_string = my_string.replaceAll(vowel, "");
        }

        return my_string;
    }
}


/*
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }

 */ // 정규표현식...
