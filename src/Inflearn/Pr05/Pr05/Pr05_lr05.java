package Inflearn.Pr05.Pr05;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_lr05 {
    private int solution(String str) {
        int answer = 0;

        Stack<Character> stack =  new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
            }else{
                stack.pop();
                if(str.charAt(i-1) == '('){
                    answer += stack.size();
                }else{
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr05 pr = new Pr05_lr05();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(pr.solution(str));
    }

    /**
     * 괄호가 있다면 십중팔구 스택 문제이다.
     */
}
