package Pr03.Pr01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pr03_lr01 {
    private List<Integer> solution(int num1, int num2, int[] numArr1, int[] numArr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < num1 && p2 < num2){
            if(numArr1[p1] < numArr2[p2]) {
                answer.add(numArr1[p1++]);
            }else{
                answer.add(numArr2[p2++]);
            }
        }

        while (p1 < num1) {
            answer.add(numArr1[p1++]);
        }
        while (p2 < num2) {
            answer.add(numArr2[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr03_lr01 pr = new Pr03_lr01();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] numArr1 = new int[num1];
        for(int i = 0; i < num1; i++){
            numArr1[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] numArr2 = new int[num2];
        for(int i = 0; i < num2; i++){
            numArr2[i] = sc.nextInt();
        }


        for (Integer x : pr.solution(num1, num2, numArr1, numArr2)) {
            System.out.print(x + " ");

        }
    }

}

/**
 * two pointer algorithm
 * 각 배열마다 포인터를 두고 값을 증가시켜 정렬하면서 합치는 코드이다.
 *
 * 시간복잡도를 신경써야한다.
 * 정렬만 하더라도 기존에는
 * 시간 복잡도가 O(nlogn) 이기 때문에 위 코드 O(n)와 엄청난 차이가 있다.
 */