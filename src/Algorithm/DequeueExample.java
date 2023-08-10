package Algorithm;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // 덱 (deque)은 양쪽으로 값을 넣을 수 있다.
        // 그러나 기본 구조는 queue와 비슷하다고 생각하면 되기에 기본적으로는 FIFO의 구조를 가지고 있음
        deque.add(1); // [1]
        deque.addFirst(2); // [2, 1]
        deque.addLast(3); // [2, 1, 3]
        deque.offer(4); // [2, 1, 3, 4]
        deque.offerFirst(5); // [5, 2, 1, 3, 4]
        deque.offerLast(6); // [5, 2, 1, 3, 4, 6]
        System.out.println(deque);

        System.out.println("가장 최상단 값(처음으로 넣었던 값, 혹은 First로 넣은 값) : " + deque.peek()); // [5]
        // peek 바리에이션
        // getFirst(), peekFirst(), getLast(), peekLast()

        deque.remove(); // [2, 1, 3, 4 ,6]
        System.out.println(deque.poll()); // 2
        // remove or poll 바리에이션
        // removeFirst(), removeLast(), pollFirst(), pollLast()

        System.out.println(deque); // [1, 3, 4, 6]

        for(int i = 0; i < 4; i++) {
            System.out.print(deque.poll() + " ");
        }

        System.out.println("\nEmpty? : " + deque.isEmpty());
    }
}
