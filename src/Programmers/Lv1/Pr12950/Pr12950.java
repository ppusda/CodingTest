package Programmers.Lv1.Pr12950;

import java.util.Arrays;

public class Pr12950 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int first = arr1.length, second = arr1[0].length;
        int[][] answer = new int[first][second];
        for(int i = 0; i < first; i++) {
            for(int j = 0; j < second; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
    }
}
