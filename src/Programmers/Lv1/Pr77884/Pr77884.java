package Programmers.Lv1.Pr77884;

public class Pr77884 {
    public static int solution(int left, int right) {
        int answer = 0;

        while(left <= right) {
            int cnt = 1;
            for(int i = 2; i <= left; i++) {
                if(left % i == 0) {
                    cnt ++;
                }
            }
            if(cnt%2 == 0) {
                answer += left;
            }else {
                answer -= left;
            }
            left++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }
}
