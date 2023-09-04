package Programmers.Lv1.Pr12910;

import java.util.ArrayList;
import java.util.Collections;

public class Pr12910 {
    public Integer[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int n: arr) {
            if(n % divisor == 0) {
                arrayList.add(n);
            }
        }
        if(arrayList.size() == 0) {
            arrayList.add(-1);
        }

        Collections.sort(arrayList);


        return arrayList.toArray(new Integer[0]);
    }
}
