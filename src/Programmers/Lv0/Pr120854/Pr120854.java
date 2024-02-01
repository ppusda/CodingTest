package Programmers.Lv0.Pr120854;

import java.util.Arrays;

public class Pr120854 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }// return Arrays.stream(strList).mapToInt(String::length).toArray();

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new Pr120854().solution(
                                new String[]{"we", "are", "the", "world!"}
                        )
                )
        );
    }
}
