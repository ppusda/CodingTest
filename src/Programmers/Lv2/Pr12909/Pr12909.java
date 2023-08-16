package Programmers.Lv2.Pr12909;

import java.util.Stack;

public class Pr12909 {
    private static Stack<Character> stack = new Stack<>();
    private static boolean solution(String s) {
        boolean answer = true;

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && ch == ')') {
                if(stack.peek() == '(') {
                    stack.pop();
                }
            } else{
                stack.push(ch);
            }
        }

        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(")()("));
    }
}
