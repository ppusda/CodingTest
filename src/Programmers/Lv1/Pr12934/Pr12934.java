package Programmers.Lv1.Pr12934;

public class Pr12934 {
    public long solution(long n) {
        long target = (long) Math.sqrt(n);

        if(target * target == n) {
            return (target+1) * (target+1);
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Pr12934 pr12934 = new Pr12934();
        System.out.println(pr12934.solution(3));
    }
}
