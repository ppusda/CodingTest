package Programmers.Lv2.Pr12953;

public class Pr12953 {
    public int solution(int[] arr) {
        int gcd = gcd(arr[0], arr[1]);
        int answer = (arr[0] * arr[1])/gcd;

        for(int i = 2; i < arr.length; i++) {
            gcd = gcd(answer, arr[i]);
            answer = (answer * arr[i])/gcd;
        }

        return answer;
    }

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Pr12953().solution(new int[] {2,6,8,14}));
    }

}

/***
 * 유클리드 호제법
 * n % m = r을 했을 때, r이 0이면 m이 최대공약수임을 뜻한다. (단, n > m)
 * 위에서 이용한 재귀문으로 풀었을 때, n > m이 아니더라도 첫 재귀에 의해 두 위치가 바뀌어 동작하므로 문제없다.
 *
 */