package Programmers.Lv2.Pr43238;

import java.util.Arrays;

public class Pr43238 {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);

        long left = 0, right = times[times.length - 1] * (long)n; // 걸릴 수 있는 최대의 시간을 설정
        while (left <= right) { // 이분 탐색을 통해 최소 시간을 탐색
            long result = 0;
            long mid = (left + right)/2;
            for (int time : times) {
                result += (mid / time);
            }
            if (result < n) {
                left = mid+1;
            } else {
                right = mid-1;
                answer = mid;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr43238().solution(6, new int[] {7, 10}));
    }
}
