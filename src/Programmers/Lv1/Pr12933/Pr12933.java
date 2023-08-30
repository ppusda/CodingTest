package Programmers.Lv1.Pr12933;

import java.util.Arrays;
import java.util.Collections;

public class Pr12933 {
    public static long solution(long n) {
        StringBuilder answer = new StringBuilder();
        char[] chArr = Long.toString(n).toCharArray();
        Integer[] arr = new Integer[chArr.length];

        int cnt = 0;
        for(char ch: chArr) {
            arr[cnt++] = ch-48;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i: arr) {
            answer.append(i);
        }

        return Long.parseLong(String.valueOf(answer));
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
