package LeetCode.Medium.Pr1823;

public class Pr1823_Sol { // 요세푸스 문제를 해결하기 위한 코드
    public int solve(int n, int k) {
        if(n == 1) return 0;  // 한 명만 남았을 때 그 사람의 인덱스는 0
        return (solve(n-1, k) + k) % n;  // n-1명의 사람들 중에서의 인덱스를 구하고, k를 더해 현재 n명 중의 인덱스를 구함
    }

    public int findTheWinner(int n, int k) {
        return solve(n, k) + 1;  // 인덱스를 사람의 번호로 변환하여 반환
    }

    public static void main(String[] args) {
        System.out.println(new Pr1823_Sol().findTheWinner(5, 2));
    }
}

/***
 *   solve (5, 2) + 1 = 2 + 1 = 3
 *     - (solve (4, 2) + 2) % 5 = (0 + 2) % 5 = 2
 *        - (solve (3, 2) + 2) % 4 = (2 + 2) % 4 = 0
 *           - (solve (2, 2) + 2) % 3 = (0 + 2) % 3 = 2
 *              - (solve (1, 2) + 2) % 2 = (0 + 2) % 2 = 0
 */
