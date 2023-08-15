package Programmers.Lv2.Pr12945;

public class Pr12945 {
    public static int solution(int n) {
        int[] answer = new int[n+1];
        answer[0] = 0;
        answer[1] = 1;

        for(int i = 2; i <= n; i++) {
            answer[i] = (answer [i-1] + answer[i-2]) % 1234567;
        }

        return answer[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
