package LeetCode.Medium.Pr2405;

import java.util.HashSet;
import java.util.Set;

public class Pr2405_Sol {
    Set<Character> visited = new HashSet<>(); // Set을 사용했더라면 좀 더 편했을 것 같다.
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
