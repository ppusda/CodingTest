package Programmers.Lv0.Pr120908;

public class Pr120908 {
    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1:2;
    }

    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }
}
