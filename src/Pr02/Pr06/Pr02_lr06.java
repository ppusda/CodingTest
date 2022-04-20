package Pr02.Pr06;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr02_lr06 {
    public boolean isPrime(int num){
        if(num == 1){
            return false;
        }

        for (int i = 2; i < num; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }

    private ArrayList<Integer> solution(int inputNumber, int[] inputArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < inputNumber; i++){
            int tmp = inputArr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr06 pr = new Pr02_lr06();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[] inputArr = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            inputArr[i] = sc.nextInt();
        }

        for (int x: pr.solution(inputNumber, inputArr)) {
            System.out.print(x + " ");
        }
    }
}

/***
 * 그냥 일반적으로 소수를 판별하는데는 num % i 로도 충분하다.
 * 숫자 뒤집는 알고리즘을 잘 기억해두자.
 *
 */
