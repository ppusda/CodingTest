package Pr03.Pr01;

import java.util.*;

public class Pr03_my01 {
    private List<Integer> solution(List<Integer> numList1, List<Integer> numList2) {
        numList1.addAll(numList2);
        numList1.sort(Comparator.naturalOrder());
        return numList1;
    }

    public static void main(String[] args) {
        Pr03_my01 pr = new Pr03_my01();
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

}