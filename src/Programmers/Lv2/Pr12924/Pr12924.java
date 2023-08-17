package Programmers.Lv2.Pr12924;

public class Pr12924 {
    public static int solution(int n) {
        int answer = 0;

        int left = 1, right = 1;
        int sum = 1;

        while (left <= n && right <= n) {
            if(n > sum) {
                right++;
                sum += right;
            } else {
                if(n == sum) {
                    answer ++;
                }
                sum -= left;
                left++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
