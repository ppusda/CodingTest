package Programmers.Lv2.Pr12941;

import java.util.Arrays;

public class Pr12941 {

    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length-i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2}, new int[] {3, 4}));
    }
}
