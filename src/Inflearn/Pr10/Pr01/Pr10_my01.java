package Inflearn.Pr10.Pr01;

import java.util.Scanner;

public class Pr10_my01 {

    static int dy[];
    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Pr10_my01 pr = new Pr10_my01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(pr.solution(n));
    }
}

/**
 * 동적 프로그래밍 (Bottom-up)
 * 아래서 부터 올라가는 알고리즘이다.
 * 아래의 경우의 수를 더해서 위의 경우의 수를 알아낸다.
 */