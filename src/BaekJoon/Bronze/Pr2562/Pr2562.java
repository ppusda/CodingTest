package BaekJoon.Bronze.Pr2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int i = 1; i <= 9; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(max < tmp){
                max = tmp;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.print(idx);
    }
}

// 최대 값