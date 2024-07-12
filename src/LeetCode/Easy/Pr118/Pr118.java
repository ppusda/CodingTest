package LeetCode.Easy.Pr118;

import java.util.ArrayList;
import java.util.List;

public class Pr118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        if (numRows == 0) return answer;
        if (numRows == 1) {
            answer.add(List.of(1));
            return answer;
        }


        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if (1 < i && 0 <= j-1 && j <= answer.get(i-1).size()-1) {
                    list.add(j, answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
                } else {
                    list.add(j, 1);
                }
            }
            answer.add(list);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr118().generate(5));
    }
}
