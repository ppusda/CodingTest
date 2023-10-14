package Programmers.Lv1.Pr68935;

public class Pr68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n, 3));

        return Integer.parseInt(String.valueOf(sb.reverse()), 3);
    }
}
