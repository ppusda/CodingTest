package Programmers.Lv0.Pr120818;

public class Pr120818 {
    public int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.80);
        }
        if (price >= 300000) {
            return (int) (price * 0.90);
        }
        if (price >= 100000) {
            return (int) (price * 0.95);
        }
        return price;
    }

    public static void main(String[] args) {
        System.out.println(new Pr120818().solution(100010));
    }
}
