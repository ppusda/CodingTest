package BaekJoon.Silver.Pr2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2581 {
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int res = 0;
        int min = Integer.MAX_VALUE;

        for(int i = m; i <= n; i++){
            if(isPrime(i)){
                res += i;
                min = Math.min(i, min);
            }
        }

        if(res == 0){
            System.out.println("-1");
        }else{
            System.out.println(res);
            System.out.println(min);
        }

    }
}
