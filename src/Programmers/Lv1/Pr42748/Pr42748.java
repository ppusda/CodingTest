// Programmers: 42748_K번째수
package Programmers.Lv1.Pr42748;

import java.util.Arrays;

public class Pr42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0;
        for(int[] command : commands) {
            int start = command[0]-1;
            int end = command[1];
            int k = command[2]-1;

            int[] splitArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(splitArray);

            answer[index++] = splitArray[k];
        }

        return answer;
    }
}
