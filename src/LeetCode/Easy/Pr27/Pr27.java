package LeetCode.Easy.Pr27;

import java.util.ArrayList;
import java.util.List;

public class Pr27 {
    public int removeElement(int[] nums, int val) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                numList.add(num);
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            nums[i] = numList.get(i);
        }

        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Pr27().removeElement(new int[] {3,2,2,3}, 3));
    }
}
