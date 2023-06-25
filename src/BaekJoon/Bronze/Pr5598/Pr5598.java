package BaekJoon.Bronze.Pr5598;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (char ch: input.toCharArray()) {
            int tmp = (int)ch - 3;
            if(tmp < 65) {
                int calc = 90 - (64 - tmp);
                System.out.print((char)calc);
            }else if(tmp <= 90){
                System.out.print((char) tmp);
            }
        }
    }
}
