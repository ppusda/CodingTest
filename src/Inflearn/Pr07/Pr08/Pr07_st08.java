package Inflearn.Pr07.Pr08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr07_st08 {
    int answer = 0;
    int[] dis= {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){
        ch = new int[10001]; // 최대 값까지 미리 선언
        ch[s] = 1;
        Q.offer(s);
        int level = 0;
        while (!Q.isEmpty()){
            int len = Q.size(); // 레벨당 노드의 수
            for(int i = 0; i < len; i ++){
                int x = Q.poll();
                for (int di : dis) {
                    int res = x + di;
                    if(res == e){
                        return level+1; // 레벨 n+1을 탐색 중이지만, 실제 레벨 값은 n이기에 +1 후 출력
                    }
                    if(res >= 1 && res <= 10000 && ch[res] == 0){
                        // 최소보다 크거나 같고, 최대보다 작거나 같으며, 기존의 있던 값이 아니어야한다.
                        ch[res] = 1;
                        Q.offer(res);
                    }
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Pr07_st08 pr = new Pr07_st08();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(pr.BFS(s, e));
    }

    /***
     * 굳이 노드를 쓰지않더라도,
     * 해결할 수 있다는 걸 볼 수 있었던 문제
     *
     * Queue를 잘이용하면 정말 유용할 것 같다.
     */
}
