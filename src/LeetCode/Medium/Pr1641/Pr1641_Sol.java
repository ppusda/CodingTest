package LeetCode.Medium.Pr1641;

public class Pr1641_Sol {
    public int countVowelStrings(int n) {
        return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
        // 이전 예제와 같은 맥락에서 바라봤을 때, a의 경우의 수, e의 경우의 수, i의 경우의 수, o의 경우의 수 u의 경우의 수를 모두 계산하면 된다.
        // 이는 중복 조합식을 이용한 예제이다.
    }

    public static void main(String[] args) {
        System.out.println(new Pr1641_Sol().countVowelStrings(3));
    }
}

/**
 * (n+4)! / 4!(n+4-4)!
 * (n+4)! / 4!n!
 * (n+4)(n+3)(n+2)(n+1)(n) / 4!n!
 * (n+4)(n+3)(n+2)(n+1) / 24
 */
