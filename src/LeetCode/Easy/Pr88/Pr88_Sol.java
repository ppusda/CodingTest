package LeetCode.Easy.Pr88;

public class Pr88_Sol {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Last = m-1;
        int num2Last = n-1;
        int bigArrayLast = m+n-1;

        while(num2Last>=0){
            if(num1Last>=0 && nums1[num1Last] > nums2[num2Last]){
                nums1[bigArrayLast--] = nums1[num1Last--];
            }
            else{
                nums1[bigArrayLast--] = nums2[num2Last--];
            }
        }

    }
}
