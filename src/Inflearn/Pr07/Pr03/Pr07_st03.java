package Inflearn.Pr07.Pr03;

public class Pr07_st03 {
    public int DFS(int n){
        if(n == 1){
            return 1;
        }else{
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Pr07_st03 pr = new Pr07_st03();
        System.out.println(pr.DFS(5));
    }
}
/**
 *  재귀를 이용한 팩토리얼 구현
 *
 *  n * DFS(n-1)
 *  DFS(5) = 5 * DFS(4)
 *  DFS(4) = 4 * DFS(3)
 *  DFS(3) = 3 * DFS(2)
 *  DFS(2) = 2 * DFS(1)
 *  DFS(1) = 1
 *  1 * 2 * 3 * 4 * 5 = 120
 *
 *  위와 같은 형태로 이루어지고 계산된다.
 */