package Pr05.Pr01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr05_my01 {
    private String solution(String str) {
        String answer = "NO";
        char[] strArr = str.toCharArray();

        if(strArr[0] == ')' || strArr[strArr.length-1] == '('){
            return answer;
        }

        Map<Character, Integer> match = new HashMap<>();
        for(char x : str.toCharArray()){
            match.put(x, match.getOrDefault(x, 0)+1);
        }

        if(match.get('(') == match.get(')')){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_my01 pr = new Pr05_my01();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(pr.solution(str));

    }
}

/**
 * 괄호의 짝이 맞아야만 한다.
 * 위처럼 짜면 안된다.
 */
