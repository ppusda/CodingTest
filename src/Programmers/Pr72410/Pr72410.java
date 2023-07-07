package Programmers.Pr72410;

import java.util.Locale;

public class Pr72410 {

    public static String solution(String new_id) {
        new_id = new_id.toLowerCase(Locale.ROOT); // 1 - 소문자화
        new_id = new_id.replaceAll("[^a-z0-9-_.]",""); // 2 - 특정 문자 외 제거
        new_id = new_id.replaceAll("[.]+", "."); // 3 - .. => .
        new_id = new_id.replaceAll("^\\.", ""); // 4-1 - 맨 앞 . 제거
        new_id = new_id.replaceAll("\\.$", ""); // 4-2 - 맨 뒤 . 제거
        if(new_id.equals("")) new_id = "a"; // 5 - 빈 문자열이라면 a 대입
        if(new_id.length() >= 16) new_id = new_id.substring(0, 15); // 6-1 - 문자열의 길이가 15 이상이라면 첫 15자만 이용
        new_id = new_id.replaceAll("\\.$", ""); // 6-2 - 맨 뒤 . 제거
        if(new_id.length() <= 2) { // 7 - 문자열의 길이가 2 이하라면 3이 될 때까지 마지막 글자 반복
            while(new_id.length() != 3) {
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }
}
