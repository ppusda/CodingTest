package LeetCode.Easy.Pr2824;

import java.util.Collections;
import java.util.List;

public class Pr2824 {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size()-1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right --;
            }
        }

        return count;
    }
}
