package BaekJoon.Bronze.Pr2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder star = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                System.out.print(" ");
            }
            star.append("*");
            System.out.println(star);
        }
    }
}

// 공백 4개 + * 로