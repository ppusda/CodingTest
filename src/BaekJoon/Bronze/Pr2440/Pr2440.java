package BaekJoon.Bronze.Pr2440;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder star = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        star.append("*".repeat(Math.max(0, n)));
        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(star.charAt(i));
            }
            System.out.println();
        }
    }
}
