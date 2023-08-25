package Programmers.Lv1.Pr12916;

public class Pr12916_Sol {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}

// 람다도 고려 항목으로 생각해보자.