package LeetCode.Medium.Pr1043;

public class Pr1043 {
    private Integer dp[];

    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new Integer[arr.length];

        return getMaxSum(arr, 0, k);
    }

    private int getMaxSum(int[] arr, int curIdx, int k) {
        if (curIdx >= arr.length) {
            return 0;
        }

        if (dp[curIdx] != null) {
            return dp[curIdx];
        }

        int currentMaxSum = 0;
        int partitionLeftMaxValue = arr[curIdx];

        for (int i = curIdx; i < Math.min(arr.length, curIdx + k); i++) {
            int partitionRightMaxValue = getMaxSum(arr, i + 1, k);

            partitionLeftMaxValue = Math.max(partitionLeftMaxValue, arr[i]);

            int sumIfPartitioned = partitionRightMaxValue +
                    (partitionLeftMaxValue * (i  - curIdx + 1));

            currentMaxSum = Math.max(currentMaxSum, sumIfPartitioned);
        }

        return dp[curIdx] = currentMaxSum;
    }
}
