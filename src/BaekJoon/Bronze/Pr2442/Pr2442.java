package BaekJoon.Bronze.Pr2442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2442 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;

        for(int i = 1; i <= n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < cnt; k++) {
                System.out.print("*");
            }
            cnt += 2;
            System.out.println();
        }
    }
}
