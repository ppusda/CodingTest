// Programmers: 12915_뒤에서 5등까지
package Programmers.Lv0.Pr181853;

import java.util.Arrays;

public class Pr181853 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);

        int index = 0;
        for(int i = 0; i < 5; i++) {
            answer[index] = num_list[i];
            index ++;
        }
        return answer;
    }
    // Arrays.sort(num_list);
    // return Arrays.copyOfRange(num_list, 0, 5);

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Pr181853().solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }
}
