package Pr07.Pr05;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Pr07_st05 {
    Node root;
    public void DFS(Node root){
        if(root == null){
            return;
        }else{
            //System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
            System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
            //System.out.print(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        Pr07_st05 pr = new Pr07_st05();
        pr.root = new Node(1);
        pr.root.lt = new Node(2);
        pr.root.rt = new Node(3);
        pr.root.lt.lt = new Node(4);
        pr.root.lt.rt = new Node(5);
        pr.root.rt.lt = new Node(6);
        pr.root.rt.rt = new Node(7);
        pr.DFS(pr.root);

    }

    /**
     *  DFS(깊이 우선 탐색)
     *  이진 트리 탐색 시 탐색하는 방법 중 하나이다.
     *
     *  전위순회, 중위순회, 후위순회 방법이있다.
     *  각각 부모노드의 위치를 기준으로 하여,
     *
     *  전위는 부모노드가 제일 앞에,
     *  중위는 부모노드가 중간에,
     *  후위는 부모노드가 후위에 탐색된다.
     *
     *  코드 설명
     *  노드를 생성(new) 했을 때,
     *  그 노드의 하위노드 (lt, rt)를 만들어두고,
     *  생성자를 통해서 노드의 값을 할당, 그리고 하위 노드의 값을 비워둔다.
     *
     *  이 작업을 반복하여 이진 트리를 만들게 된다.
     *
     *  전위, 중위, 후위
     *  코드 내에서 System.out.print()를 하는 위치에 따라서
     *  전위, 중위, 후위 순회의 여부가 결정된다.
     *
     *  이렇게 될 수 있는 이유를 전위 순회 프로세스와 함께 살펴보자.
     *
     *  전위 순회
     *  DFS(root)
     *  첫번째,
     *      처음에는 root 이다.
     *      Null이 아니며 root의 data값을 출력하고, 재귀를 통해 DSF(root.lt)를 실행한다.
     *      위 부분에서 root.rt 탐색은 stackFrame에 적재되게 된다.
     *
     *      출력값 : 1
     *
     *  두번째,
     *      다음은 root.lt인데,
     *      이번에도 Null이 아니며 root.lt의 값을 출력하게 되고, DSF(root.lt.lt)를 실행한다.
     *      root.lt.rt는 stackFrame에 적재되게 된다.
     *
     *      출력 값 : 2
     *
     *  세번째,
     *      다음은 root.lt.lt이다.
     *      이번에도 null 이 아니기 때문에 root.lt.lt의 값을 출력하고 DSF(root.lt.lt.lt)를 실행한다.
     *      root.lt.lt.rt는 stackFrame에 적재되게 된다.
     *
     *      출력 값 : 4
     *
     *  네번째,
     *      다음은 root.lt.lt.lt 이다.
     *      이번에는 Null이기 때문에 아무 동작없이 return하게된다.
     *
     *  다섯번째,
     *      다음은 stackFrame에 걸려있었던 root.lt.lt.rt이다.
     *      이번에도 Null 이기 때문에 아무 동작없이 return하게된다.
     *
     *  ---- 세번째 함수 종료 ----
     *
     *  여섯번째,
     *      다음에도 stackFrame에 걸려있었던 root.lt.rt 이다.
     *      이번에는 Null이 아니기에 root.lt.rt의 값을 출력하고, DSF(root.lt.rt.lt)를 실행한다.
     *
     *      root.lt.rt.rt는 stackFrame에 적재되게 된다.
     *
     *      출력값 : 5
     *
     *  일곱번째,
     *      이번에는 root.lt.rt.lt 이다.
     *      이번에는 Null이기 때문에 아무 동작없이 return하게 된다.
     *
     *  여덟번째,
     *      이번에는 root.lt.rt.rt 이다.
     *      이번에도 Null이기 때문에 아무 동작없이 return하게 된다.
     *
     *  ---- 여섯번째 함수 종료 ----
     *
     *  ---- 두번째 함수 종료 ----
     *
     *  아홉번째,
     *      다음에도 stackFrame에 걸려있었던 root.rt 이다.
     *      이번에도 Null이 아니기에 root.rt의 값을 출력하고, DFS(root.rt.lt)를 실행한다.
     *      root.rt.rt는 stackFrame에 적재되게 된다.
     *
     *      출력값 : 3
     *
     *  열번째,
     *      이번에는 root.rt.lt이다.
     *      이번에도 Null이 아니기 때문에, root.rt.lt의 값을 출력하고, DFS(root.rt.lt.lt)를 실행한다.
     *      root.rt.lt.rt는 stackFrame에 적재되게 된다.
     *
     *      출력값 : 6
     *
     *  열한번째,
     *      이번에는 root.rt.lt.lt이다.
     *      Null이기 때문에, return으로 끝난다.
     *
     *  열두번째,
     *      이번에는 root.rt.lt.rt이다.
     *      Null이기 때문에, return으로 끝난다.
     *
     *  ---- 열번째 함수 종료 ----
     *
     *  열세번째,
     *      이번에는 stackFrame에 걸려있던 root.rt.rt이다.
     *      Null이 아니기 때문에, root.rt.rt의 값을 출력하고, DFS(root.rt.rt.lt)를 실행한다.
     *      root.rt.rt.rt는 stackFrame에 걸리게된다.
     *
     *      출력 값 : 7
     *
     *  열네번째,
     *      이번에는 root.rt.rt.lt 이다.
     *      Null이기 떄문에, return으로 끝난다.
     *
     *
     *  열다섯번째,
     *      이번에는 root.rt.rt.rt 이다.
     *      Null이기 때문에, return으로 끝난다.
     *
     *  ---- 열세번째 함수 종료 ----
     *
     *  ---- 아홉번째 함수 종료 ----
     *
     *  --- 첫번째 함수 종료 ----
     *
     *  총 출력 값 : 1 2 4 5 3 6 7
     *
     *  위와 같이 전위순회가 끝나게 된다.
     *
     *
     * 중위 순회, 후위 순회도 위와같은 방식으로 이루어진다.
     * DFS(lt)를 통해 먼저 출력 후 부모 노드를 출력하느냐,
     * DFS(lt), DFS(rt) 후 부모 노드를 출력할 것인가를 통해서
     *
     * 중위 : 4 2 5 1 6 3 7
     * 후위 : 4 5 2 6 7 3 1
     *
     * 처럼 값이 달라지게 되는 것이다.
    */


}

