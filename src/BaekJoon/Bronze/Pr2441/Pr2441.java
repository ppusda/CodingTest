package BaekJoon.Bronze.Pr2441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String star = "";
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i; k < n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
