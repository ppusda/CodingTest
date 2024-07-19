package LeetCode.Easy.Pr1470;

public class Pr1470_Sol {
    public int[] shuffle(int[] nums, int n) {

        int len = nums.length;

        // to store the pair of numbers in right half of the original array
        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }

        int index = 0;
        // to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
        }

        return nums;
    }
}
