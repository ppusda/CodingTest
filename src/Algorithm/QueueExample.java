package Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            queue.add(i);
        }

        System.out.println(queue);
        System.out.println("가장 최상단 값(마지막으로 넣었던 값) : " + queue.peek());
        queue.remove();
        System.out.println(queue);

        for(int i = 0; i < 9; i++) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println("\nEmpty? : " + queue.isEmpty());
    }
}
