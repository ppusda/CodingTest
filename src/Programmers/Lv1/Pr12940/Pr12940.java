package Programmers.Lv1.Pr12940;

public class Pr12940 {
    public int[] solution(int n, int m) {
        int tmp_n = n;
        int tmp_m = m;
        while(true) {
            int tmp = tmp_n % tmp_m;
            if(tmp == 0) {
                break;
            }else {
                tmp_n = tmp_m;
                tmp_m = tmp;
            }
        }

        return new int[] {tmp_m, (n * m)/tmp_m};
    }
}

// 유클리드 호제법은
// x % y = r
// ...
// y % r = 0 일때
// r이 최대공약수이다.

// 그리고 (x*y)/r 이 최소공배수이다.
