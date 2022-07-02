package Pr08.Pr06;

import java.util.Scanner;

public class Pr08_st06 {

    private static int[] arr, chk, pm;
    private static int len, sLen;

    public void DFS(int idx){
        if(idx == sLen){
            for (int p : pm) {
                System.out.print(p + " ");
            }
            System.out.println();
        }else{
            for(int i = 0; i < len; i++){
                if(chk[i] == 0){
                    pm[idx] = arr[i];
                    chk[i] = 1;
                    DFS(idx + 1);
                    chk[i] = 0;

                }
            }
        }
    }

    public static void main(String[] args) {
        Pr08_st06 pr = new Pr08_st06();
        Scanner sc = new Scanner(System.in);

        len = sc.nextInt();
        sLen = sc.nextInt();

        arr = new int[len];
        chk = new int[len];
        pm = new int[sLen];

        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        pr.DFS(0);
    }
}
