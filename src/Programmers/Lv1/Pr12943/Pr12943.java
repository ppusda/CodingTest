package Programmers.Lv1.Pr12943;

public class Pr12943 {
    public static int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if(answer >= 500) {
                return -1;
            }
            answer ++;
            if(num % 2 == 0) {
                num /= 2;
            } else if(num % 2 != 0){
                num *= 3;
                num ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
