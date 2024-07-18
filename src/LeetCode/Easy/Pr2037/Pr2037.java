package LeetCode.Easy.Pr2037;

import java.util.Arrays;

public class Pr2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int answer = 0;

        for (int i = 0; i < seats.length; i++) {
            answer += Math.abs(seats[i] - students[i]);
        }

        return answer;
    }
}
