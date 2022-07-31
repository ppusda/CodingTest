package Inflearn.Pr08.Pr01;

import java.util.Scanner;

public class Pr08_my01 {
    static String answer = "NO";
    static int n, total;
    static int[] ch, nist;
    public void DFS(int index, int sum){
        if(index >= n){
            return;
        }
        if(total - sum == sum){
            answer = "YES";
        }else{
            ch[index] = 1;
            DFS(index+1, sum + nist[index]);

            ch[index] = 0;
            DFS(index+1, sum);
        }
    }

    public static void main(String[] args) {
        Pr08_my01 pr = new Pr08_my01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n];
        nist = new int[n];
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            nist[i] = tmp;
            total += tmp;
        }

        pr.DFS(0, 0);
        System.out.println(answer);
    }
}
