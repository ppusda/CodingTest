package LeetCode.Easy.Pr2500;

import java.util.Arrays;

public class Pr2500 {
    public int deleteGreatestValue(final int[][] grid) {
        int result = 0;

        for(int[] row : grid)
            Arrays.sort(row);

        for(int i = grid[0].length - 1; i >= 0; --i) {
            int max = 1;

            for(int[] row : grid)
                max = Math.max(row[i], max);

            result += max;
        }

        return result;
    }
}
