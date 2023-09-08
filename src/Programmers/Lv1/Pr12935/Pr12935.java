package Programmers.Lv1.Pr12935;

import java.util.Arrays;

public class Pr12935 {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            answer = new int[] {-1};
        } else{
            int min = Arrays.stream(arr).min().orElse(0);
            answer = Arrays.stream(arr).filter(i -> i != min).toArray();
        }
        return answer;
    }
}

/***
 *      if (arr.length <= 1) return new int[]{ -1 };
 *       int min = Arrays.stream(arr).min().getAsInt();
 *       return Arrays.stream(arr).filter(i -> i != min).toArray();
 *  비슷한 답안, stream을 오랜만에 써봐서 다까먹었따.
 */
