package Inflearn.Pr03.Pr05;

import java.util.Scanner;

public class Pr03_lr05 {
    private int solution(int num) {
        int answer = 0, sum = 0, lt = 0;
        int m = num/2 + 1;

        int[] arr = new int[m];
        for (int i = 0; i < m; i++){
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < m; rt ++){
            sum += arr[rt];
            if(sum == num){
                answer ++;
            }
            while(sum >= num){
                sum -= arr[lt++];
                if(sum == num) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr03_lr05 pr = new Pr03_lr05();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(pr.solution(num));
    }


}
