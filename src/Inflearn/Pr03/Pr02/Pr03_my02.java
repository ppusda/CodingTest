package Inflearn.Pr03.Pr02;

import java.util.*;

public class Pr03_my02 {
    private List<Integer> solution(List<Integer> numList1, List<Integer> numList2) {
        List<Integer> answerList = new ArrayList<>();

        if(numList1.size() > numList2.size()){
            for (Integer x : numList1) {
                if(numList2.contains(x)){
                    answerList.add(x);
                }
            }
        }else{
            for (Integer x : numList2) {
                if(numList1.contains(x)){
                    answerList.add(x);
                }
            }
        }


        answerList.sort(Comparator.naturalOrder());
        return answerList;
    }

    public static void main(String[] args) {
        Pr03_my02 pr = new Pr03_my02();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        List<Integer> numList1 = new ArrayList<>();
        for(int i = 0; i < num1; i++){
            numList1.add(sc.nextInt());
        }
        int num2 = sc.nextInt();
        List<Integer> numList2 = new ArrayList<>();
        for(int i = 0; i < num2; i++){
            numList2.add(sc.nextInt());
        }

        for (Integer x : pr.solution(numList1, numList2)) {
            System.out.print(x + " ");

        }
    }

    /**
     * TimeLimit Exception 이 발생한다.
     */
}
