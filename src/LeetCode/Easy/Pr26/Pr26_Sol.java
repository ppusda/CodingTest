package LeetCode.Easy.Pr26;

public class Pr26_Sol {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i =1; i < nums.length; i++ ){
            if(nums[index-1] != nums[i]){ // index를 0 부터 시작하여 다른 값이 나왔을 때, 교환
                nums[index++]= nums[i];
            }
        }
        return index;
    }
}
