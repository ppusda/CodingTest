package Pr09.Pr06;

import java.util.Scanner;

public class Pr09_my06 {
    static int[] unf;

    private static int Find(int t) {
        if(unf[t] == t){
            return t;
        }else {
            return unf[t] = Find(unf[t]);
        }
    }

    private static void Uion(int target, int goal){
        int tFind = Find(target);
        int gFind = Find(goal);
        if(tFind != gFind){
            unf[tFind] = gFind;
        }
    }

    public static void main(String[] args) {
        Pr09_my06 pr = new Pr09_my06();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Uion(a, b);
        }

        int idx = sc.nextInt();
        int res = sc.nextInt();

        int fIdx = Find(idx);
        int fRes = Find(res);

        if (fIdx != fRes) {
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
/**
 *  친구인가? (Uion & Find)
 *
 *  Uion은 집합을 만들어주는 메서드이다.
 *  Find는 그 집합의 최종 목적지가 어디인지 알려주는 메서드이다.
 *
 *  친구 정보 (a, b)를 입력하면서, 해당 인덱스에 대한 집합을 저장한다.
 *  위 코드에서는 해당 정보를 입력하면서 최대 목적지에 대한 값을 unf[]에 넣게된다. (unf[1] = 5 라고 하면, 1에서 5까지 갈 수 있다는 뜻이다.)
 *
 *  이후, 알고 싶은 친구관계 (c, v)를 입력받고, YES or NO를 출력하게 된다.
 *  친구관계인지 판별하기 위해서 Find() 메서드를 이용하고, 둘의 값이 같으면 친구, 아니라면 친구가 아닌 것이다.
 *
 *  EX_) (1, 4)가 입력됬다면, unf[1] = 4, unf[4] = 4 처럼 같은 정점을 바라보고 있기 때문이다.
 *
 */
