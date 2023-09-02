package Programmers.Lv1.Pr12947;

public class Pr12947_Sol {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}
