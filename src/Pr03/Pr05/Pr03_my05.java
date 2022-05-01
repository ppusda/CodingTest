package Pr03.Pr05;

import java.util.*;

public class Pr03_my05 {
    private int solution(int num) {
        int answer = 0;

        int ht = 2, tt = 1;
        int sum = ht + tt;

        while(ht < num && tt < num){
            if(num == sum){
                answer ++;
                sum += ++ht - tt++;
            }else if (num > sum){
                sum += ++ht;
            }else{
                sum -= tt++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Pr03_my05 pr = new Pr03_my05();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(pr.solution(num));
    }

}