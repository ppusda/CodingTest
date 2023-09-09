package Programmers.Lv1.Pr12922;

public class Pr12922 {
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sb.append("박");
            } else {
                sb.append("수");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
