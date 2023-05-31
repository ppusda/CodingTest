package BaekJoon.Pr10818;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pr10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> numList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            numList.add(sc.nextInt());
        }

        Collections.sort(numList);

        System.out.print(numList.get(0) + " " + numList.get(n-1));

    }
}
