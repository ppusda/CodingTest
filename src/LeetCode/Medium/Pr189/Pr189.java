package LeetCode.Medium.Pr189;

public class Pr189 {
    public void rotate(int[] nums, int k) {
        int size = nums.length;

        if (size < k) {
            return;
        }

        int cIndex = size-k;
        int[] copy = nums.clone();

        for (int i = 0; i < size; i++) {
            if (cIndex == size) {
                cIndex = 0;
            }

            nums[i] = copy[cIndex++];
        }
    }

    public static void main(String[] args) {
        new Pr189().rotate(new int[] {1,2,3,4,5,6,7}, 3);
    }
}
