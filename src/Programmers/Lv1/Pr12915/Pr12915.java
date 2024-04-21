package Programmers.Lv1.Pr12915;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pr12915 {
    public String[] solution(String[] strings, int n) {
        Map<String, String> indexMap = new HashMap<>();
        int length = strings.length;
        String[] sortList = new String[length];

        for (int i = 0; i < length; i++) {
            String word = strings[i].substring(n, n+2);
            sortList[i] = word;
            indexMap.put(word, strings[i]);
        }

        Arrays.sort(sortList);

        for (int i = 0; i < length; i++) {
            strings[i] = indexMap.get(sortList[i]);
        }

        return strings;
    } // 실패, 중복이 고려되지 않음. 이를 해결해보려하였으나 코드가 너무 길어져 다른 방법 모색

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new Pr12915().solution(
                                new String[]{"abce", "abcd", "cdx"},
                                2
                        )
                )
        );
    }
}
