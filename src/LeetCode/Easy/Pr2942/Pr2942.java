package LeetCode.Easy.Pr2942;

import java.util.ArrayList;
import java.util.List;

public class Pr2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(Character.toString(x))) {
                answer.add(i);
            }
        }

        return answer;
    }
}
