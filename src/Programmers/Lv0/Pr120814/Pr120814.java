package Programmers.Lv0.Pr120814;

public class Pr120814 {
    public int solution(int n) {
        int tmp = 7;
        int cnt = 1;

        while (true) {
            if (n <= tmp) {
                return cnt;
            }

            tmp += 7;
            cnt ++;
        }
    }
}


// int answer = (n%7==0) ? n/7 : n/7 + 1;
// return (n + 6) / 7;
// 다른 두가지 방법