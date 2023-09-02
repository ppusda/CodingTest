package Programmers.Lv1.Pr12947;

import java.util.Arrays;

public class Pr12947 {
    public static boolean solution(int x) {
        boolean answer = true;

        int tmp = 0;
        for (String s : Integer.toString(x).split("")) {
            tmp += Integer.parseInt(s);
        }

        if(x % tmp != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
