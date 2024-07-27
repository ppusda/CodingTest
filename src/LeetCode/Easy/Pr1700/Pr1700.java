package LeetCode.Easy.Pr1700;

import java.util.LinkedList;
import java.util.Queue;

public class Pr1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.add(student);
        }

        int check = 0;
        int index = 0;
        while (check < queue.size()) {
            if (sandwiches[index] == queue.peek()) {
                index ++;
                queue.poll();
                check = 0;
                continue;
            }

            queue.add(queue.poll());
            check ++;
        }

        if (queue.isEmpty()) {
            return 0;
        }

        return check;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1700().countStudents(new int[] {1,1,0,0}, new int[] {0,1,0,1}));
    }
}
