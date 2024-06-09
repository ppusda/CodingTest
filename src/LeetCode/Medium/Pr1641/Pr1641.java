package LeetCode.Medium.Pr1641;

import java.util.Arrays;

public class Pr1641 {
    public int countVowelStrings(int n) {
        int[] dp = new int[]{1, 1, 1, 1, 1}; // 각 a, e, i, o, u

        while (--n > 0) {
            for (int i = 3; i >= 0; i--) { // 각 인덱스 a, e, i, o 에 대한 개수를 할당함
                dp[i] += dp[i + 1]; // a는 나머지 4개를 포함한 경우의 수, e는 나머지 3개를 포함한 경우의 수, i 는 나머지 2개, o는 나머지 1개, u는 제외 / u는 항상 1개 => 모두 u인경우
            }
        } // 이를 n이 1일 될 때까지 반복하여, 2자리 => 3자리 => 4자리 => ... 순으로 계산해 나간다.

        return Arrays.stream(dp).sum();
    }

    public static void main(String[] args) {
        System.out.println(new Pr1641().countVowelStrings(3));
    }
}

//