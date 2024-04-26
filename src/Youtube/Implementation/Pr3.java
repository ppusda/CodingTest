package Youtube.Implementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pr3 {
    public String solution(String n) {
        char[] arr = n.toCharArray();
        List<Character> charList = new ArrayList<>();
        int total = 0;

        for (char ch : arr) {
            if (Character.isAlphabetic(ch)) {
                charList.add(ch);
            } else {
                total += Character.getNumericValue(ch);
            }
        }

        charList.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }

        return sb.toString() + total;
    }

    public static void main(String[] args) {
        System.out.println(new Pr3().solution("K1KA5CB7"));
    }
}

// https://www.youtube.com/watch?v=2zjoKjt97vQ