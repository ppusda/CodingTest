package Programmers.Lv1.Pr81301;

import java.util.HashMap;
import java.util.Map;

public class Pr81301 {
    public int solution(String s) {
        Map<String, String> words = initWords();

        for (String word: words.keySet()) {

            if (s.contains(word)) {
                s = s.replaceAll(word, words.get(word));
            }
        }

        return Integer.parseInt(s);
    }

    public Map<String,String> initWords() {
        Map<String, String> words = new HashMap<>();

        words.put("zero", "0");
        words.put("one", "1");
        words.put("two", "2");
        words.put("three", "3");
        words.put("four", "4");
        words.put("five", "5");
        words.put("six", "6");
        words.put("seven", "7");
        words.put("eight", "8");
        words.put("nine", "9");

        return words;
    }
}
