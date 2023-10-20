package Programmers.Lv1.Pr12930;

public class Pr12930 {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for(char ch: s.toUpperCase().toCharArray()) {
            if(ch == ' ') {
                answer.append(ch);
                count = 0;
            } else if(count % 2 != 0) {
                answer.append((char)(ch + 32));
                count ++;
            } else {
                answer.append(ch);
                count ++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
