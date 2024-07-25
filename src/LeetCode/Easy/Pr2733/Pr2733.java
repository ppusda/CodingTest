package LeetCode.Easy.Pr2733;

import java.util.Arrays;

public class Pr2733 {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[1];
    }
}
