package Programmers.Lv1.Pr82612;

public class Pr82612 {
    public static long solution(int price, int money, int count) {
        long tmp = price;
        for(int i = 2; i <= count; i++) {
            tmp += price * i;
        }
        long answer = tmp-money;

        return (answer > 0 ? answer:0);
    }

    public static void main(String[] args) {
        System.out.println(solution(1000, 10000, 2));
    }
}
