// Algorithm: 스택 두 개로 큐 만들기
package Algorithm;

import java.util.Stack;

class StackQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public StackQueue() {
        this.inputStack = new Stack<>();
        this.outputStack = new Stack<>();
    }

    public void enqueue(int n) {
        inputStack.push(n);
    }

    public int dequeue() {
        if (!outputStack.isEmpty()) {
            return outputStack.pop();
        }

        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }

        return outputStack.pop();
    }

}

public class TwoStackQueue {
    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(1);
        stackQueue.enqueue(2);
        stackQueue.enqueue(3);

        for (int i = 0; i < 3; i++) {
            System.out.println(stackQueue.dequeue());
        }
    }
}
