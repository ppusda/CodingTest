package Programmers.Lv1.Pr86051;

public class Pr86051 {
    public static int solution(int[] numbers) {
        int answer = 45;

        for(int n: numbers) {
            answer -= n;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
