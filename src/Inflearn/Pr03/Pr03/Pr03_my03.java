package Inflearn.Pr03.Pr03;

import java.util.Scanner;

public class Pr03_my03 {
    private int solution(int num1,  int num2, int[] numList1) {
        int answer = 0;

//        for(int i = 0; i < num1-num2; i++){
//            int sum = 0;
//            for (int j = 0; j < num2; j++){
//                sum += numList1[i+j];
//            }
//            if(answer < sum){
//                answer = sum;
//            }
//        } O(n^2)이 되어버린다.

        int sum = 0;

        for(int i = 0; i < num2; i++){
            sum += numList1[i];
        }
        answer = sum;

        for(int k = num2; k < num1; k++){
            sum += numList1[k];
            sum -= numList1[k-num2];
            if(sum > answer){
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr03_my03 pr = new Pr03_my03();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] numArr = new int[num1];
        for(int i = 0; i < num1; i++){
            numArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(num1, num2, numArr));
    }

    /**
     * Sliding Window 알고리즘
     * 배열에서 Window(읽는 길이)를 유지하면서 이동하면서 읽어내는 알고리즘이다.
     * 원래라면 On^2으로 타임 아웃이었지만, 이를 통해서 해결 할 수 있었다.
     */
}
