package LeetCode.Pr42;

import java.util.Stack;

public class Pr42 {
    public static int trap(int[] height) {
        int len = height.length;
        int water = 0;

        Stack<Integer> stack = new Stack<>();
        for(int right = 0; right < len; right++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[right]){
                int bottom = stack.pop();
                if(stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                water += (right-left-1) * (Math.min(height[left], height[right])-height[bottom]);
            }
            stack.push(right);
        }

        return water;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}

/**
 *  LeetCode: 42_Trapping Rain Water (https://leetcode.com/problems/trapping-rain-water/description/)
 *  Stack 을 이용한 문제 해결법
 *
 *  1회전 : right = 0 / stack = [0]
 *  2회전 : right = 1 / heigth[0] < height[1] 이므로 while문 동작 / stack = [1]
 *      2-1회전 : bottom = 1 / stack.isEmpty() 이므로 Skip
 *  3회전 : right = 2 / heigth[1] < height[2] 만족하지 않으므로 while문 동작 X / stack = [1, 2]
 *  4회전 : right = 3 / heigth[1] < height[3] 이므로 while문 동작 / stack = [3]
 *      4-1회전 : bottom = 2 / stack.isEmpty() 는 아님 / left = 1 / water += (3-1-1) * (min(1, 2)-0) = 1
 *      4-2회전 : bottom = 1 / stack.isEmpty()이므로 Skip
 *  5회전 : right = 4 / heigth[3] < height[4] 만족하지 않으므로 while문 동작 X / stack = [3, 4]
 *  6회전 : right = 5 / heigth[4] < height[5] 만족하지 않으므로 while문 동작 X / stack = [3, 4, 5]
 *  7회전 : right = 6 / height[5] < height[6] 만족하지 않으므로 while문 동작 X / stack = [3, 4, 6]
 *      7-1회전 : bottom = 5 / stack.isEmpty() 는 아님 / left = 4 / water += (6-4-1) * (min(1, 1)-0) = 1
 *      7-2회전 : heigth[4] < height[6] 만족하지 않으므로 while문 동작 X
 *  8회전 : right = 7 / height[4] < height[7] 이므로 while문 동작 / stack = [7]
 *      8-1회전 : bottom = 6 / stack.isEmpty() 는 아님 / left = 4 / water += (7-4-1) * (min(1, 3)-1) = 0
 *      8-2회전 : bottom = 4 / stack.isEmpty() 는 아님 / left = 3 / water += (7-3-1) * (min(2, 3)-1) = 3
 *      8-3회전 : bottom = 3 / stack.isEmpty()이므로 Skip
 *  9회전 : right = 8 / height[7] < height[8] 만족하지 않으므로 while문 동작 X / stack = [7, 8]
 *  10회전 : right = 9 / height[8] < height[9] 만족하지 않으므로 while문 동작 X / stack = [7, 8, 9]
 *  11회전 : right = 10 / height[9] < height[10] 이므로 while문 동작 / stack = [7, 8, 10]
 *      11-1회전 : bottom = 9 / stack.isEmpty() 는 아님 / left = 8 / water += (10-8-1) * (min(2, 2)-1) = 1
 *  12회전 : right = 11 / height[10] < height[11] 만족하지 않으므로 while문 동작 X / stack = [7, 8, 10, 11]
 *
 *  water = 1 + 1 + 3 + 1 = 6
 *
 *  물 깊이를 아래와 같은 계산식으로 구하는 것이 인상적이었다.
 *  (right-left-1) * (Math.min(height[left], height[right])-height[bottom])
 *
 *  (오른쪽 ~ 왼쪽 사이의 물 넓이 [가로 길이]) * (물 깊이 [세로 길이])
 */