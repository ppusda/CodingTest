package Inflearn.Pr08.Pr03;

import java.util.Scanner;

public class Pr08_my03 {
    static int answer = 0;
    static int problem, timeLimit;
    static int[] pArr, tArr;

    public void DFS(int index, int pSum, int tSum){
        if(tSum < timeLimit){
            return;
        } // 전체적으로 코드는 같았으나 위 와 같이 break 코드를 추가하는 것이 중요하다.
        if(index == problem){
            if(timeLimit >= tSum){
                answer = Math.max(pSum, answer);
            }
        }else{
            DFS(index + 1, pSum + pArr[index], tSum + tArr[index]);
            DFS(index + 1, pSum, tSum);
        }
    }

    public static void main(String[] args) {
        Pr08_my03 pr = new Pr08_my03();
        Scanner sc = new Scanner(System.in);

        problem = sc.nextInt();
        timeLimit = sc.nextInt();

        pArr = new int[problem];
        tArr = new int[problem];
        for(int i = 0; i < problem; i++){
            pArr[i] = sc.nextInt();
            tArr[i] = sc.nextInt();
        }

        pr.DFS(0, 0, 0);
        System.out.println(answer);
    }

}
