package LeetCode.Easy.Pr1464;

import java.util.Arrays;

public class Pr1464 {
    public int maxProduct(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        return (nums[size-1]-1) * (nums[size-2]-1);
    }
}
