package Programmers.Lv1.Pr132267;

public class Pr132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newCola = (n/a)*b;
            int leftCola = n%a;

            answer += newCola;
            n = newCola + leftCola;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr132267().solution(3, 1, 20));
    }
}

// n / (a*b) = 새로 받는 콜라병
// n % a = 남은 콜라 빈 병
