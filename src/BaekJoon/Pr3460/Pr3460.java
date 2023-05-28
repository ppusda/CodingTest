package BaekJoon.Pr3460;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr3460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> binList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            binList.add(Integer.toBinaryString(sc.nextInt()));
        }

        for (String v: binList) {
            int cnt = 0;
            for(int i = v.length()-1; i >= 0; i--){
                if(v.charAt(i) == '1') {
                    System.out.print(cnt + " ");
                }
                cnt ++;
            }

            System.out.println("");
        }
    }
}
