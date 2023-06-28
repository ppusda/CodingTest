package BaekJoon.Bronze.Pr2576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 7; i++){
            int input = Integer.parseInt(br.readLine());
            if(input % 2 != 0) {
                res += input;
                min = Math.min(min, input);
            }
        }

        if(res == 0){
            System.out.print(-1);
        } else{
            System.out.println(res);
            System.out.print(min);
        }
    }
}
