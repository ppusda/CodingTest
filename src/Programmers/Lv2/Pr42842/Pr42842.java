package Programmers.Lv2.Pr42842;

import java.util.Arrays;

public class Pr42842 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int target = brown + yellow;

        for(int i = 1; i <= yellow; i++) {
            if(answer.length > 0){
                break;
            }
            for(int j = yellow; j >= 1; j--) {
                if(j * i == yellow) {
                    if((j+2) * (i+2) == target) {
                        answer = new int[] {j+2, i+2};
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
    }
}

// 24
// 24 * 1, 12 * 2, 6 * 4

// 48
// 48 * 1, 24 * 2, 12 * 4, 8 * 6


