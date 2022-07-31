package Inflearn.Pr07.Pr14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr07_st14 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int v){
        Queue<Integer> queue = new LinkedList<>(); // 검사요소를 담기 위한 큐
        ch[v]  = 1; // 이미 검사한 상태인지 확인하기 위한 check 배열
        dis[v] = 0; // 최단 거리 (레벨)를 나타내기 위한 배열
        queue.offer(v); // Queue 에 초기 값 등록
        while(!queue.isEmpty()){ // Queue가 빌 때 까지
            int cv = queue.poll(); // Queue에서 하나를 꺼내고
            for(int nv : graph.get(cv)){ // 그 Queue 값의 인접리스트를 foreach로 돌린다.
                if(ch[nv] == 0){ // 갈 수 있는 간선 상에서 0인 요소 (안 간 곳)이 있다면
                    ch[nv] = 1; // 1로 만들어 체크하고
                    queue.offer(nv); // queue에 추가한다.
                    dis[nv] = dis[cv]+1; // 방문한 기록을 남긴다.
                }
            }
        }

    }

    public static void main(String[] args) {
        Pr07_st14 pr = new Pr07_st14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i = 0 ; i < m; i ++){ // 인접 리스트에 값을 넣기 위해 for문
            int a = sc.nextInt(); // 0 ~ m 까지의 인접리스트 생성
            int b = sc.nextInt(); // 갈 수 있는 간선 정보 삽입
            graph.get(a).add(b); // a번 인덱스의 ArrayList에 b를 넣는다 (갈 수 있는 간선을 기록)
        }
        ch[1] = 1;
        pr.BFS(1); // BFS 실행
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " + dis[i]); // dis 배열 출력
        }
    }
}