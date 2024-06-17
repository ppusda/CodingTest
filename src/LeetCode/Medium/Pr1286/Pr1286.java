package LeetCode.Medium.Pr1286;

import java.util.PriorityQueue;

public class Pr1286 {

    private PriorityQueue<String> combination = new PriorityQueue<>();

    public Pr1286(String characters, int combinationLength) {
        initCombination(characters, combinationLength, 0, new StringBuilder());
    }

    public String next() {
        return combination.poll();
    }

    public boolean hasNext() {
        return !combination.isEmpty();
    }

    private void initCombination(String characters, int length, int start, StringBuilder stringBuilder) {
        if (length == 0) {
            combination.add(stringBuilder.toString());
            return;
        }

        for (int i = start; i <= characters.length()-length; i++) {
            stringBuilder.append(characters.charAt(i));
            initCombination(characters, length-1, i+1, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
