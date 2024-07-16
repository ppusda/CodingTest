package LeetCode.Easy.Pr1351;

public class Pr1351 {
    public int countNegatives(int[][] grid) {
        int answer = 0;
        for (int[] g : grid) {
            for (int n : g) {
                if (n < 0) {
                    answer ++;
                }
            }
        }

        return answer;
    }
}
