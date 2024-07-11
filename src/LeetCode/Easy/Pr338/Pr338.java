package LeetCode.Easy.Pr338;

public class Pr338 {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for (int i = 0; i <= n; i++) {
            answer[i] += Integer.bitCount(i);
        }

        return answer;
    }
}
