package LeetCode.Medium.Pr2405;

import java.util.ArrayList;
import java.util.List;

public class Pr2405 {
    public int partitionString(String s) {
        int answer = 0;
        char[] array =  s.toCharArray();

        List<Character> checkList = new ArrayList<>();
        for (char ch : array) {
            if (checkList.contains(ch)) {
                answer++;
                checkList.clear();
            }
            checkList.add(ch);
        }

        return answer;
    }
}
