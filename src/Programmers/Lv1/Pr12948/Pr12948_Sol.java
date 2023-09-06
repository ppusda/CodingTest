package Programmers.Lv1.Pr12948;

public class Pr12948_Sol {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
} // String => Array => String
