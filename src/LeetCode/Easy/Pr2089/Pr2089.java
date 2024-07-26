package LeetCode.Easy.Pr2089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pr2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) answer.add(i);
            if (target < nums[i]) break;
        }

        return answer;
    }
}
