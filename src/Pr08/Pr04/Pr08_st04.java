package Pr08.Pr04;

import java.util.Scanner;

public class Pr08_st04 {

    private static int[] comb;
    private static int num, len;

    private void DFS(int targetIdx, int startIdx) {
        if(targetIdx == len){
            for (int i : comb) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }else{
            for(int i = startIdx; i <= num; i++){
                comb[targetIdx] = i;
                DFS(targetIdx + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Pr08_st04 pr = new Pr08_st04();
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        len = sc.nextInt();
        comb = new int[len];

        pr.DFS(0, 1);
    }
}
