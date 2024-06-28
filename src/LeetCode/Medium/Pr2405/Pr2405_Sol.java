package LeetCode.Medium.Pr2405;

import java.util.HashSet;
import java.util.Set;

public class Pr2405_Sol {
    public int partitionString(String s) {
        Set<Character> visited = new HashSet<>();
        int substrings = 0;
        for(char c : s.toCharArray()){
            if(visited.contains(c)){
                substrings++;
                visited.clear();
            }
            visited.add(c);
        }

        return substrings + 1;
    }
}
