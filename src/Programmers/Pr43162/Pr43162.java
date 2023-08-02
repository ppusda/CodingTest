package Programmers.Pr43162;

public class Pr43162 {
    public static int answer;
    public static void solution(int n, int[][] computers) {
        boolean[] visit = new boolean[n];

        for(int i=0; i<n; i++) {
            if(!visit[i]){
                dfs(n, computers, visit, i);
                answer++;
            }
        }
    }

    public static void dfs(int n, int[][] computers, boolean[] visit, int i) {
        visit[i]=true;

        for(int j = 0; j<n; j++) {
            if(computers[i][j]==1 && !visit[j] && j!=i) {
                dfs(n, computers, visit, j);
            }
        }
    }

    public static void main(String[] args) {
        solution(3,new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        System.out.println(answer);
    }
}

/**
 * 그래프탐색 뼈대 문제
 * visit = Network Check하는 요소
 * solution의 회전 하나당 Network 하나를 Check하게 되며, 모두가 연결되어있다면 visit의 모든 요소가 true가 될 것이다.
 *
 */