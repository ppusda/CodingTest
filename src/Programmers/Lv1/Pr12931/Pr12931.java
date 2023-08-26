package Programmers.Lv1.Pr12931;

public class Pr12931 {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for(char ch: str.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(ch));
        }

        return answer;
    }
}
