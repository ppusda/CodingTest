package Algorithm;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println("가장 최상단 값(마지막으로 넣었던 값) : " + stack.peek());

        for(int i = 0; i < 10; i++) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nEmpty? : " + stack.isEmpty());
    }
}
