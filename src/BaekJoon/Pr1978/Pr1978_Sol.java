package BaekJoon.Pr1978;

import java.util.Scanner;

public class Pr1978_Sol{
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;
        for(int i=0; i<T; i++){
            int num = sc.nextInt();
            if(isPrime(num)) result++;
        }
        System.out.println(result);
    }
}
