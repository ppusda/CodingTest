package Programmers.Lv2.Pr12973;

import java.util.Stack;

public class Pr12973_Sol {
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(stack.size() == 0){
                stack.push(c);
            }
            else if(stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }


        return stack.size() > 0 ? 0 : 1; // 마지막으로 삼항연산자를 사용한게 인상깊음.
    }
}
