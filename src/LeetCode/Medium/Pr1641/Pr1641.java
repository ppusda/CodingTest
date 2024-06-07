package LeetCode.Medium.Pr1641;

public class Pr1641 {
    public int countVowelStrings(int n) {
        int[] dp = new int[]{1, 1, 1, 1, 1};
        int ans = 0;

        while (--n > 0) {
            for (int i = 3; i >= 0; i--) {
                dp[i] += dp[i + 1];
            }
        }

        for (int x : dp) {
            ans += x;
        }

        return ans;
    }
}
