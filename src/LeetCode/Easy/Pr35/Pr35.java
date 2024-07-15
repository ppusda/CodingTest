package LeetCode.Easy.Pr35;

public class Pr35 {
    public int searchInsert(int[] nums, int target) {
        int half = 0;
        int left = 0, right = nums.length-1;
        while (left <= right) {
            half = left + (right-left)/2;
            if (nums[half] == target) {
                return half;
            }

            if (nums[half] < target) {
                left = half+1;
            } else {
                right = half-1;
            }
        }

        return left;
    }
}
