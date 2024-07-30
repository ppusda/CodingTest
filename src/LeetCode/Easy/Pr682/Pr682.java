package LeetCode.Easy.Pr682;

import java.util.Stack;

public class Pr682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    int first = stack.pop();
                    int second = stack.peek();
                    stack.push(first);
                    stack.push(first + second);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                default:
                    stack.push(Integer.parseInt(operation));
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr682().calPoints(new String[] {"5","2","C","D","+"}));
    }
}
