package Programmers.Lv1.Pr12930;

public class Pr12930_Sol {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int count = 0;
        String[] array = s.toUpperCase().split("");

        for(String letter : array) {
            count = letter.equals(" ") ? 0 : count + 1;
            answer.append(count%2 == 0 ? letter.toLowerCase() : letter);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
