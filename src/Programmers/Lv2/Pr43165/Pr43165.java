package Programmers.Lv2.Pr43165;

public class Pr43165 {
    public static int cnt = 0;

    public static void dfs(int idx, int sum, int[] numbers, int target) {
        if(idx == numbers.length && sum == target) {
            cnt++;
            return;
        }

        if(idx >= numbers.length) {
            return;
        }

        dfs(idx+1, sum+numbers[idx], numbers, target);
        dfs(idx+1, sum-numbers[idx], numbers, target);
    }

    public static int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 1, 1, 1}, 3));
    }
}

/**
 *  visit 를 써야 할 때와 아닐 때를 잘 고려해보자
 *  또한, return 조건도 잘 고려해보자.
 */