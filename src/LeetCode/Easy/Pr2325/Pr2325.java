package LeetCode.Easy.Pr2325;

import java.util.HashMap;
import java.util.Map;

public class Pr2325 {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put(' ', ' ');

        char alphabet = 'a';
        for (char ch : key.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                continue;
            }
            hashMap.put(ch, alphabet++);
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : message.toCharArray()) {
            sb.append(hashMap.get(ch));
        }

        return sb.toString();
    }
}
