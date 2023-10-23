package Programmers.Lv1.Pr147355;

public class Pr147355 {
    public static int solution(String t, String p) {
        int answer = 0;

        int start = 0;
        int end = p.length();

        while(end < t.length()+1) {
            long tmp = Long.parseLong(t.substring(start, end));

            if(tmp <= Long.parseLong(p)) {
                answer ++;
            }

            start ++;
            end ++;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("2147483649", "2147483650"));
    }
}
