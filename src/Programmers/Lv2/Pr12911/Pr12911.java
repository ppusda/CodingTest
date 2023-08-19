package Programmers.Lv2.Pr12911;

public class Pr12911 {
    public static int check(int n) {
        return Integer.toBinaryString(n).replace("0", "").length();
    }

    public static int solution(int n) {
        int answer = 0;
        int nLength = check(n);

        while (true) {
            n++;

            if(check(n) == nLength) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(78));
    }
}
