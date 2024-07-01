package LeetCode.Easy.Pr2974;

import java.util.Arrays;
import java.util.Stack;

public class Pr2974 {
    public int[] numberGame(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[nums.length];
        Arrays.sort(nums);

        int count = 0, index = 0;
        for (int num: nums) {
            if (count == 2) {
                while (!stack.isEmpty()) {
                    answer[index++] = stack.pop();
                }
                count = 0;
            }
            stack.push(num);
            count ++;
        }

        while (!stack.isEmpty()) {
            answer[index++] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Pr2974().numberGame(new int[]{5, 4, 2, 3})));
    }
}
