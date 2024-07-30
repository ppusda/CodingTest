package LeetCode.Easy.Pr1475;

public class Pr1475 {
    public int[] finalPrices(int[] prices) {
        int size = prices.length;
        int[] answer = new int[size];
        int index = 0;

        for (int i = 0; i < size-1; i++) {
            int price = prices[i];
            for (int j = i+1; j < size; j++) {
                if (price >= prices[j]) {
                    price -= prices[j];
                    break;
                }
            }
            answer[index++] = price;
        }

        answer[index] = prices[size-1];
        return answer;
    }
}

