package BaekJoon.Silver.Pr1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1978 {
    public static boolean isPrime(int num) {
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            int in = Integer.parseInt(st.nextToken());
            if(in <= 1){
                continue;
            }

            if(isPrime(in)) {
                res ++;
            }
        }

        System.out.println(res);
    }
}
