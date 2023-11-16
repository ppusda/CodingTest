package Programmers.Lv1.Pr12926;

import java.util.Arrays;

public class Pr12926 {
    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }

            int chTemp = ch + n;
            if (65 <= ch && ch <= 90) {
                if (chTemp > 90) {
                    answer.append((char) (65 + (chTemp-91)));
                } else {
                    answer.append((char) chTemp);
                }
            } else if (97 <= ch && ch <= 122) {
                if (chTemp > 122) {
                    answer.append((char) (97 + (chTemp-123)));
                } else {
                    answer.append((char) chTemp);
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 25));
    }

    /**
     * 대문자는 65 ~ 90
     * 소문자는 97 ~ 122
     *
     * Character.isLowerCase(ch)
     * Character.isUpperCase(ch)
     * 를 이용해도 됬을 것 같다.
     */
}
