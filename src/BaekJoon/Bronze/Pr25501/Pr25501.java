package BaekJoon.Bronze.Pr25501;

import java.util.Scanner;

public class Pr25501 {

    private static int result;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            result = 0;
            System.out.println(isPalindrome(sc.next()) + " " + result);
        }
        sc.close();
    }

    private static int recursion(String s, int l, int r){
        result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    private static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

}
