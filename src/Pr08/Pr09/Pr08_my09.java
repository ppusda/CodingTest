package Pr08.Pr09;

import java.util.Scanner;

public class Pr08_my09 {

    private static int size;
    private static int target;
    private static int combi[];

    private void DFS(int level, int startIdx){
        if(level == target){
            for (int i : combi) {
                System.out.print(i);
            }
            System.out.println();
        }else{
            for(int i = startIdx; i <= size; i++){
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Pr08_my09 pr = new Pr08_my09();
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        target = sc.nextInt();
        combi = new int[target];


        pr.DFS(0, 1);
    }
}
