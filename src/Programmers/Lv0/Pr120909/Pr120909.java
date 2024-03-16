package Programmers.Lv0.Pr120909;

public class Pr120909 {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt) == n ? 1:2;
    }
}

/*
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }

 */