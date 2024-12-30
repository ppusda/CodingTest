package BaekJoon.Silver.Pr4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr4779 {
    static int n;
    static StringBuilder answer;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            answer = new StringBuilder();

            int len = (int) Math.pow(3, n);

            for (int i = 0; i < len; i++) {
                answer.append("-");
            }

            recur(0, len);
            System.out.println(answer);

        }
    }

    public static void recur(int start,int size) {
        if(size == 1) {
            return;
        }
        int newSize = size/3;

        for(int i = start + newSize; i < start + 2 * newSize; i++) {
            answer.setCharAt(i, ' ');
        }

        recur(start, newSize);
        recur(start + 2 * newSize, newSize);
    }
}
