package Programmers.Lv1.Pr68935;

public class Pr68935_Sol {
    public static int solution(int n) {
        String a = "";

        while(n > 0){
            a = a + (n % 3);
            n /= 3;
        }


        return Integer.parseInt(a,3);
    }

    public static void main(String[] args) {
        solution(125);
    }
}
