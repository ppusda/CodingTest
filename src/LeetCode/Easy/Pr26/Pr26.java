package LeetCode.Easy.Pr26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pr26 {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 1));
        }

        int index = 0;
        for (int n : map.keySet()) {
            nums[index++] = n;
        }

        return map.size();
    }
}
