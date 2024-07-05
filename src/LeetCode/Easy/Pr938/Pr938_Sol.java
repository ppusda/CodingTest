package LeetCode.Easy.Pr938;

import java.util.LinkedList;
import java.util.Queue;

public class Pr938_Sol {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        if(root.val>=low && root.val<=high){
            ans+=root.val;
        }
        if(root.val>low){
            ans+=rangeSumBST(root.left, low, high);
        }
        if(root.val<high){
            ans+=rangeSumBST(root.right, low, high);
        }
        return ans;
    }

}
