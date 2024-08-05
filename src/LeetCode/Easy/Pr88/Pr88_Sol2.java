package LeetCode.Easy.Pr88;

import java.util.Arrays;

public class Pr88_Sol2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i]; // copy done
        }
        Arrays.sort(nums1);
    }
}
