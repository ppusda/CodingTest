// Programmers: 181840_정수 찾기
package Programmers.Lv0.Pr181840;

import java.util.Arrays;

public class Pr181840 {
    class Solution {
        public int solution(int[] num_list, int n) {
            return Arrays.stream(num_list).anyMatch(i -> i == n) ? 1 : 0;
        }
    }
}
