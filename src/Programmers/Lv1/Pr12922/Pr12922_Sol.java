package Programmers.Lv1.Pr12922;

public class Pr12922_Sol {
    public String watermelon(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
/**
 * n이 4일때
 * [4/2+1] = 3
 * new char은 수박수박수박이 된다.
 * substring(0,4) => 수박수박
 *
 * 즉, 몇번 반복할지 선택하고 이를 substring으로 잘라내는 것이다.
 */