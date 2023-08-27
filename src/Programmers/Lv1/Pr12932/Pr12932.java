package Programmers.Lv1.Pr12932;

import java.util.Arrays;

public class Pr12932 {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();

        int[] answer = new int[sb.length()];
        for(int i = 0; i < sb.length(); i++) {
            answer[i] = sb.charAt(i)-48;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr12932 pr12932 = new Pr12932();
        System.out.println(Arrays.toString(pr12932.solution(12345)));
    }
}
