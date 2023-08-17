package Programmers.Lv2.Pr12924;

public class Pr12924_Sol {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i += 2)
            if (n % i == 0)
                answer++;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
