// Programmers: 181849_문자열 정수의 합
package Programmers.Lv0.Pr181849;

public class Pr181849 {
    public int solution(String num_str) {
        int answer = 0;
        for (String num: num_str.split("")) {
            answer += Integer.parseInt(num);
        }

        return answer;
    }
}
