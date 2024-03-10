package Programmers.Lv0.Pr120892;

public class Pr120892_Sol {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer.append(cipher.charAt(i - 1));
        }

        return answer.toString();
    }

}
