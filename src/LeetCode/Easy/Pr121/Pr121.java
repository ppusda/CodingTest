package LeetCode.Easy.Pr121;

public class Pr121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }

        return profit;
    } // 매도 값이 가장 큰 상황을 찾아야 함.
    // 산 지점을 기록 해두고 큰 값을 만났을 때, 얻을 수 있는 이익을 산출함.

    public static void main(String[] args) {
        System.out.println(new Pr121().maxProfit(new int[] {3,2,6,5,0,3}));
    }
}
