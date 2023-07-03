package Programmers.Pr12977;

public class Pr12977 {

    private static int answer = 0;
    private static int[] arr;
    private static boolean[] visited;
    private static int numsLen;

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        arr = nums;
        numsLen = nums.length;
        visited = new boolean[numsLen];

        for(int i = 0; i < numsLen; i++){
            visited[i] = true;
            dfs(i, 1);
            visited[i] = false;
        }
        System.out.println(answer);

        return answer;
    }

    private static void dfs(int idx, int level) {
        if (level == 3) {
            int sum = 0;
            for(int i = 0; i < numsLen; i++) {
                if(visited[i]) {
                    sum += arr[i];
                }
            }

            if(isPrime(sum)) {
                answer++;
            }

            return;
        }

        for(int i = idx; i < numsLen; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i, level+1);
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// 다른 DFS 참고하여 작성하였음...
// 3중 for문을 이용하여 풀 수 있었지만, 머리 속에 DFS가 생각나버리는 김에
// 복습 겸에 구현해보았다.
// https://kistone.tistory.com/81