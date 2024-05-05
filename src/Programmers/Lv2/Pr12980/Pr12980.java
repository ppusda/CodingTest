// Programmers: 12980_점프와 순간 이동
package Programmers.Lv2.Pr12980;

public class Pr12980 {
    public int solution(int n) {
        int answer = 1;

        while (n != 1) {
            if (n%2 == 0) {
                n /= 2;
                continue;
            }

            n -= 1;
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr12980().solution(5000));
    }
}
