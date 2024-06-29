package Programmers.Lv1.Pr1845;

import java.util.HashSet;
import java.util.Set;

public class Pr1845 {
    public int solution(int[] nums) {
        int target = nums.length/2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int size = set.size();
        return target > size ? size : target;
    }
}
