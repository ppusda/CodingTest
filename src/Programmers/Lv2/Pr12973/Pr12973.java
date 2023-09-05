package Programmers.Lv2.Pr12973;

import java.util.Stack;

public class Pr12973 {
    public static int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if(!stack.isEmpty()) {
                if(stack.peek() == ch) {
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }else {
                stack.push(ch);
            }
        }

        if(stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abcda"));
    }
}
