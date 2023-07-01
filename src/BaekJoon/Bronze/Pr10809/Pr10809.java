package BaekJoon.Bronze.Pr10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String chr = br.readLine();

        Arrays.fill(arr, -1);

        for(char ch: chr.toCharArray()){
            if(arr[ch-97] == -1){
                arr[ch-97] = chr.indexOf(ch);
            }
        }

        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}