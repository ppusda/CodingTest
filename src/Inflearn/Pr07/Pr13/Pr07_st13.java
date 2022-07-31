package Inflearn.Pr07.Pr13;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr07_st13 {
    static int n, m, answer = 0; // n = 노드의 개수, m = 간선의 개수, answer = 경로가 완성된 횟수
    static ArrayList<ArrayList<Integer>> graph; //인접리스트
    static int[] ch;
    public void DFS(int v){
        if(v==n){
            answer++;
        }else {
            for (int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr07_st13 pr = new Pr07_st13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0 ; i < m; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); // a번 인덱스의 ArrayList에 b를 넣는다 (갈 수 있는 간선을 기록)
        }
        ch[1] = 1;
        pr.DFS(1);
        System.out.println(answer);
    }
}

/**
 * 인접행렬에서는 모든 배열을 다 탐색해야한다는 단점이 있다.
 * (특히 정점의 개수가 많아지면 엄청난 시간이 소요될 것이다.)
 *
 * 이를 해결하기 위해 인접리스트를 사용하면된다.
 * 각 노드 별 갈 수 있는 노드를 정리해둔
 * ArrayList<ArrayList<Integer>> 가 되는 것이다.
 *  1 - 3, 5
 *  2 - 2, 4
 *  ...
 * 이 와 같이 말이다.
 *
 * 이를 이용하면 시간 소요를 줄일 수 있을 것이다.
 *
 */
