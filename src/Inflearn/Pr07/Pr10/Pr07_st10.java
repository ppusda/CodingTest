package Inflearn.Pr07.Pr10;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}

public class Pr07_st10 {
    Node root;
    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                Node cur = Q.poll();
                if(cur.lt == null && cur.rt == null){
                    return L;
                }
                if(cur.lt != null){
                    Q.offer(cur.lt);
                }
                if(cur.rt != null){
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Pr07_st10 pr = new Pr07_st10();
        pr.root = new Node(1);
        pr.root.lt = new Node(2);
        pr.root.rt = new Node(3);
        pr.root.lt.lt = new Node(4);
        pr.root.lt.rt = new Node(5);
        System.out.println(pr.BFS(pr.root));
    }
}

/**
 * 말단노드 탐색 - BFS
 *      Queue = 1
 *      root.lt, root.rt는 null이 아니므로 말단노드가 아니다.
 *      L = 0 => 1
 *      Queue = 2 3
 *
 *      Queue = 2 3
 *      2 => root.lt.lt, root.lt.rt는 null이 아니므로 말단노드가 아니다.
 *      Queue = 3 4 5
 *
 *      Queue = 3 4 5
 *      3 => root.rt.lt, root.rt.rt는 null이므로 말단노드이다.
 *      L = 1 return
 *
 *
 *
 */