package LeetCode.Easy.Pr1512;

import java.util.HashMap;
import java.util.Map;

public class Pr1512 {

    public int numIdenticalPairs(int[] nums) {
        int ans = 0, cnt[] = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;
        }
        return ans;
    }

}
