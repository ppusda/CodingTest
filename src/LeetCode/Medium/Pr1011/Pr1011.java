package LeetCode.Medium.Pr1011;

public class Pr1011 {
    public int shipWithinDays(int[] weights, int days) {
        int answer = 0;
        int left = 0, right = 0;
        for (int tmp : weights) {
            left = Math.max(left, tmp);
            right += tmp;
        }

        while (left <= right) {
            int mid = (left+right)/2;
            int day = 1, result = 0;

            for (int box : weights) {
                if (result + box > mid) {
                    day++;
                    result = 0;
                }
                result += box;
            }

            if (day <= days) {
                answer = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1011().shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }
}
