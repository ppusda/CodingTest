package Programmers.Lv0.Pr120816;

public class Pr120816 {
    public int solution(int slice, int n) {
        if (n % slice != 0) return n / slice + 1;
        return n / slice;
    }
}
