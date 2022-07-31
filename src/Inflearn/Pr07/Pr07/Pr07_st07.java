package Inflearn.Pr07.Pr07;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}


public class Pr07_st07 {
    Node root;
    public void BFS (Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null){
                    Q.offer(cur.lt);
                }
                if(cur.rt != null){
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pr07_st07 pr = new Pr07_st07();
        pr.root = new Node(1);
        pr.root.lt = new Node(2);
        pr.root.rt = new Node(3);
        pr.root.lt.lt = new Node(4);
        pr.root.lt.rt = new Node(5);
        pr.root.rt.lt = new Node(6);
        pr.root.rt.rt = new Node(7);
        pr.BFS(pr.root);

    }
}

/**
 * BFS - 넓이 우선 탐색
 * 최단 거리 탐색을 할 때 쓰인다.
 *
 * 레벨 탐색 순회
 * 이진 트리에서 각 단계(가로로 한 줄 씩)가 한 레벨이다.
 *
 *      0 : 1
 *      1 : 2, 3
 *      2 : 3, 4, 5, 6
 *
 * 위와 같이 탐색하여 출력하게 된다는 것이다.
 *
 * main에서 자료가 모두 입력된다. (이진트리)
 * 이를 위처럼 출력할 수 있도록 코드가 작성되어있다.
 *
 *  19 ~ 21
 *      Queue를 선언해 순서대로 사용될 수 있도록 한다.
 *      Q.offer(root)를 통해 root의 값을 넣는다.
 *
 *      L은 레벨을 뜻하고, 레벨에 따라 출력될 떄 사용된다.
 *
 *      Queue가 비어있을 때까지 while문을 돌리게되며,
 *      while문 내에서는 root의 하위 값들을 탐색하게 된다.
 *
 *  23 ~ 36
 *      cur 은 최근 사용된 Node이다.
 *
 *      1단계
 *          root.lt, root.rt를 탐색해 비어있는 값인지 확인하고 Queue에 적재한다.
 *          Queue에 적재된 순서대로 출력한다.
 *
 *      2단계
 *          root.lt.lt, root.lt.rt / root.rt.lt, root.rt.rt를 탐색해 출력한다.
 *          Queue에 적재된 순서대로 출력한다.
 *
 */