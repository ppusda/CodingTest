package BaekJoon.Bronze.Pr2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();

        for(int i = 0; i < n; i++) {
            star.append("*");
            System.out.println(star);
        }
    }
}
