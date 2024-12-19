package BaekJoon.Bronze.Pr24416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr24416 {

    static int code1Cnt,  code2Cnt;

    static int[] f;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =  Integer.parseInt(br.readLine());
        f = new int[n];

        br.close();

        code1Cnt = 0;
        code2Cnt = 0;

        fibo(n);
        fibonacci(n);

        System.out.println(code1Cnt + " " + code2Cnt);

    }

    static int fibo(int n){
        if(n == 1 || n == 2){
            code1Cnt++;
            return 1;
        }
        else return (fibo(n-1) + fibo(n-2));
    }

    static int fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2; i < n; i++){
            code2Cnt++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1];
    }
}
