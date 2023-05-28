package BaekJoon.Pr3460;

import java.util.Scanner;

public class Pr3460_Sol {
    public static void main(String[] args) throws Exception {

        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++) {
            int Bi=sc.nextInt();
            String Bin=Integer.toBinaryString(Bi);
            for(int j=Bin.length()-1;j>=0;j--) {
                if(Bin.charAt(j)=='1') {
                    System.out.print(Bin.length()-j-1+" ");
                }
            }
            System.out.println();
        }
    }
}