package Programmers.Lv0.Pr120825;

public class Pr120825 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char ch: my_string.toCharArray()) {
            for(int i = 0; i < n; i++) {
                answer += ch;
            }
        }
        return answer;
    }
}
