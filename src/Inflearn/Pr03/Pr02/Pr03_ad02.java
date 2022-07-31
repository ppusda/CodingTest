package Inflearn.Pr03.Pr02;

import java.util.*;

public class Pr03_ad02 {
    private List<Integer> solution(int num1, int num2, int[] numArr1, int[] numArr2) {
        List<Integer> answerList = new ArrayList<>();

        Arrays.sort(numArr1);
        Arrays.sort(numArr2);

        int p1 = 0, p2 = 0;

        while(p1 < num1 && p2 < num2){
            if(numArr1[p1] == numArr2[p2]){
                answerList.add(numArr1[p1]);
                p1++;
                p2++;
            }else if(numArr1[p1] > numArr2[p2]){
                p2++;
            }else{
                p1++;
            }
        }

        return answerList;
    }

    public static void main(String[] args) {
        Pr03_ad02 pr = new Pr03_ad02();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] numArr1 = new int[num1];
        for(int i = 0; i < num1; i++){
            numArr1[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] numArr2 = new int[num2];
        for(int j = 0; j < num2; j++){
            numArr2[j] = sc.nextInt();
        }

        for (Integer x : pr.solution(num1, num2, numArr1, numArr2)) {
            System.out.print(x + " ");

        }
    }
    /**
     * TwoPointer 알고리즘
     * 포인터를 두개를 두고 비교해나가기 시작하는 알고리즘이다.
     */
}
