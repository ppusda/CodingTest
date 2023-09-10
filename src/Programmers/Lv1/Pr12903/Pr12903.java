package Programmers.Lv1.Pr12903;

public class Pr12903 {
    public static String solution(String s) {
        int start = s.length();
        int end = (start/2)+1;
        if(start%2 == 0) {
            start = (start/2)-1;
        } else {
            start /= 2;
        }

        return s.substring(start, end);
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }
}
