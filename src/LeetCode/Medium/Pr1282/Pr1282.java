package LeetCode.Medium.Pr1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pr1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        for (int i : groupSizes) {
            hashMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < groupSizes.length; i++) {
            hashMap.get(groupSizes[i]).add(i);
        }

        int index = 0;
        for (int n: hashMap.keySet()) {
            int cnt = 0;
            answer.add(index, new ArrayList<>());
            for (int m: hashMap.get(n)) {
                if (cnt == n) {
                    cnt = 0;
                    answer.add(++index, new ArrayList<>());
                }
                answer.get(index).add(m);
                cnt ++;
            }
            index ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1282().groupThePeople(new int[] {3,3,3,3,3,1,3}));
    }

}
