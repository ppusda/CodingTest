package LeetCode.Easy.Pr1480;

public class Pr1480 {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            answer[i] = sum;
        }

        return answer;
    }
}
