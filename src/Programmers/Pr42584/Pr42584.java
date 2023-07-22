package Programmers.Pr42584;

import java.util.Arrays;

public class Pr42584 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            int cnt = 0;
            for(int j = i+1; j < prices.length; j++){
                cnt++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 8, 6, 2, 4, 1})));
    }
}
