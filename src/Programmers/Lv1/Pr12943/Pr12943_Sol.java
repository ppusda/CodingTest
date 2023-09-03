package Programmers.Lv1.Pr12943;

public class Pr12943_Sol {
    public int collatz(int num) {
        long n = (long)num; // 숫자가 커지는 걸 감안한 long 캐스팅
        for(int i=0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1; // 삼항식 이용...
        }

        return -1;
    }
}
