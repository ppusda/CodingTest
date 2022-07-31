package Inflearn.Pr07.Pr12;

import java.util.Scanner;

public class Pr07_st12 {
    static int n, m, answer = 0; // n은 노드의 개수, m은 간선의 개수, answer은 경로가 완성된 횟수
    static int[][] graph; // 인접행렬, 갈 수 있는 방향에 대한 정보가 들어가 있다.
    static int[] ch; // 해당 노드에 방문 했는지를 기록하는 배열
    public void DFS(int v) {
        if(v == n){ // v가 n 번 노드(끝 노드)에 도달했는가?
            answer ++; // 끝 노드에 도달했다면 경로가 완성된 것이므로 answer 증가
        }else{
            for(int i = 1; i <= n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){ // graph[v][i] = v 에서 i로 가는 경로가 있는가?
                                                    // ch[i] = 그 노드를 이미 사용하였는가?
                    ch[i] = 1;                      // 사용 전에 1로 만들어 사용 상태로 전환
                    DFS(i);                         // 해당 노드로 이동
                    ch[i] = 0;                      // 다 사용한 후 0으로 만들어 미사용 상태로 전환
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr07_st12 pr = new Pr07_st12();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1; // 1부터 시작 (1 노드 사용중)
        pr.DFS(1); // 1 노드로 이동
        System.out.println(answer);
    }
}
