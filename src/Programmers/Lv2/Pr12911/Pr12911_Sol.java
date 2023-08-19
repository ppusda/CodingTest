package Programmers.Lv2.Pr12911;

public class Pr12911_Sol {
//    public int nextBigNumber(int n) {
//        int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
//        return n + postPattern | smallPattern;
//    } 비트 연산을 이용한 풀이..

    public int nextBigNumber(int n)
    {
        int a = Integer.bitCount(n);
        int compare = n+1;
        while(true) {
            if(Integer.bitCount(compare)==a)
                break;
            compare++;
        }
        return compare;
    } // bitCount 함수 이용

    public static void main(String[] args)
    {
        Pr12911_Sol test = new Pr12911_Sol();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}
