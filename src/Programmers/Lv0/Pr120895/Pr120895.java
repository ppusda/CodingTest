// Programmers: 120895_인덱스 바꾸기
package Programmers.Lv0.Pr120895;

public class Pr120895 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        String str1 = String.valueOf(my_string.charAt(num1));
        String str2 = String.valueOf(my_string.charAt(num2));

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer.append(str2);
                continue;
            } else if (i == num2) {
                answer.append(str1);
                continue;
            }

            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}

/* 성능이 너무 구림...
    public String solution(String my_string, int num1, int num2) {
        String str1 = String.valueOf(my_string.charAt(num1));
        String str2 = String.valueOf(my_string.charAt(num2));
        return my_string.substring(0, num1) + str2 + my_string.substring(num1 + 1, num2) + str1 + my_string.substring(num2 + 1);
    }
 */
