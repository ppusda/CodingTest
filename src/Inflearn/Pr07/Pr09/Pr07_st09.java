package Inflearn.Pr07.Pr09;

class Node {
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}

public class Pr07_st09 {
    Node root;
    public int DFS(int L, Node root){
        if(root.lt == null && root.rt == null){
            return L;
        }else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        Pr07_st09 pr = new Pr07_st09();
        pr.root = new Node(1);
        pr.root.lt = new Node(2);
        pr.root.rt = new Node(3);
        pr.root.lt.lt = new Node(4);
        pr.root.lt.rt = new Node(5);
        System.out.println(pr.DFS(0, pr.root));
    }


}
/**
 *  Tree 말단노드까지의 가장 짧은 경로
 *
 *  말단 노드란 자식노드가 없는 노드를 뜻한다. (단말노드 혹은 잎노드라고도 불린다.)
 *  두 개의 자식 노드끼리 비교하여 최소 값을 부모 노드로 return하는 방식으로 진행된다.
 */