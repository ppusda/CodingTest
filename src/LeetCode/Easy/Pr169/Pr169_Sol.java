package LeetCode.Easy.Pr169;

class Pr169_Sol {
    public int majorityElement(int[] nums) {
        return major(nums,nums[0],0);
    }

    public int major(int[] nums,int val,int index){
        int cnt = 0;
        for(int i=index;i<nums.length;i++){
            if(nums[i] == val){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt<0){
                return major(nums,nums[i],i);
            }
        }
        return val;
    }
}