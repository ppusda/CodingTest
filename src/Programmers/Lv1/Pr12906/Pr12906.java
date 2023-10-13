package Programmers.Lv1.Pr12906;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr12906 {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i : arr) {
            if(!answer.isEmpty()){
                if(answer.get(answer.size()-1) != i){
                    answer.add(i);
                }
            } else {
                answer.add(i);
            }
        }
        return Arrays.stream(answer.toArray(new Integer[answer.size()])).mapToInt(Integer::intValue).toArray();
    }
}
