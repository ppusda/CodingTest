package Programmers.Lv2.Pr70129;

import java.util.Arrays;

public class Pr70129 {

    public static int[] solution(String s) {
        int zeroSize = 0, cnt = 0;
        int sLength = s.length();

        while(s.length() != 1) {
            cnt ++;
            s = s.replace("0", "");
            zeroSize += sLength - s.length();
            s = Integer.toBinaryString(s.length());
            sLength = s.length();
        }

        return new int[] {cnt, zeroSize};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }
}
