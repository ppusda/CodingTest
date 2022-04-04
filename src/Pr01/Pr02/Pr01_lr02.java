package Pr01.Pr02;

import java.util.Scanner;

public class Pr01_lr02 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()){
//            if(Character.isLowerCase(x)){answer += Character.toUpperCase(x);}
//            else{answer += Character.toLowerCase(x);}

            if(x>=65 && x<=90){ //알파벳 대문자인 경우
                x += 32;
            }else{ //소문자인 경우 (x>=97 && x<=122)
                x -= 32;
            }
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr02 pr = new Pr01_lr02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(pr.solution(str));
    }
}
/**
 * 1. 메서드들을 이용한 풀이
 * isLowerCase(), isUpperCase(), toLowerCase() toUpperCase()
 *
 * 2.아스키코드를 이용한 풀이
 * 대문자는 65 ~ 90
 * 소문자는 97 ~ 122
 *
 * 참고 - 둘이 32 차이 난다.
 */
