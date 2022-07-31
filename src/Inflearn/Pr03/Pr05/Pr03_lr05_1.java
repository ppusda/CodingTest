package Inflearn.Pr03.Pr05;

import java.util.Scanner;

public class Pr03_lr05_1 {
    private int solution(int num) {
        int answer = 0, cnt = 1;
        num--;

        while(num > 0){
            cnt ++;
            num -= cnt;
            if(num % cnt == 0){
                answer ++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Pr03_lr05_1 pr = new Pr03_lr05_1();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(pr.solution(num));
    }

}
