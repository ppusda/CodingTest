package LeetCode.Easy.Pr1470;

public class Pr1470 {
    public int[] shuffle(int[] nums, int n) {
        int index = 0, left = 0, right = n;
        int size = n*2;
        int[] answer = new int[size];
        while (right < size) {
            answer[index++] = nums[left++];
            answer[index++] = nums[right++];
        }

        return answer;
    }
}
