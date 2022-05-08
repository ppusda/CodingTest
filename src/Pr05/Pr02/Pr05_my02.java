package Pr05.Pr02;

import java.util.*;

public class Pr05_my02 {
    private String solution(String str) {
        String answer = "";
        Stack<Character> strStack = new Stack<>();

        for(char x : str.toCharArray()){
            strStack.push(x);
            if (x == ')'){
                if(strStack.empty()){
                    continue;
                }
                while(true) {
                    if(strStack.peek() == '('){
                        strStack.pop();
                        break;
                    }
                    strStack.pop();
                }
            }
        }

        for (char x : strStack) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_my02 pr = new Pr05_my02();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(pr.solution(str));

    }
}
