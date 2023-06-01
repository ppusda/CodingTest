package BaekJoon.Pr2460;

import java.util.Scanner;

public class Pr2460 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int total = 0;

        for(int i = 1; i <= 10; i++){
            int out = sc.nextInt();
            int in  = sc.nextInt();

            total -= out;

            if(total > 10000) {
                total = 10000;
            }else{
                total += in;
            }

            max = Math.max(total, max);
        }

        System.out.println(max);
    }
}

// 17660 KB / 212 ms
