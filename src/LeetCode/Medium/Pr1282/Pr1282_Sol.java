package LeetCode.Medium.Pr1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pr1282_Sol {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> aux = new HashMap<>(groupSizes.length); // <group size, [people]>

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> group = aux.computeIfAbsent(groupSizes[i], k -> new ArrayList<Integer>());
            group.add(i);

            if (group.size() == groupSizes[i]) {
                res.add(group);
                aux.put(groupSizes[i], new ArrayList<Integer>());
            }
        }

        return res;
    }
}
