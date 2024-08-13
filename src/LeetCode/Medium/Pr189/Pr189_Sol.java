package LeetCode.Medium.Pr189;

public class Pr189_Sol {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        if (size < 1) {
            return;
        }

        k %= size;
        int[] rotated = new int[size];

        for (int i = 0; i < size; i++) {
            rotated[(i + k) % size] = nums[i];
        }

        for (int i = 0; i < size; i++) {
            nums[i] = rotated[i];
        }
    }

    public static void main(String[] args) {
        new Pr189_Sol().rotate(new int[] {1,2,3,4,5,6,7}, 3);
    }
}
