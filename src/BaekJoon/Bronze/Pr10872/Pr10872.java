package BaekJoon.Bronze.Pr10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 1;

        if(n == 0) {
            System.out.print(1);
        }else{
            for(int i = n; i > 0; i--){
                res *= i;
            }
            System.out.print(res);
        }
    }
}
