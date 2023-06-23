package BaekJoon.Bronze.Pr2443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = n; i > 0; i--){
            for(int j = n-1; j > i-1; j--){
                sb.append(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
               sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
