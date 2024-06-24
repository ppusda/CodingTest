package LeetCode.Medium.Pr2390;

import java.util.Stack;

public class Pr2390 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.pop();
                continue;
            }

            stack.push(ch);
        }

        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }

        return answer.reverse().toString();
    }
}
