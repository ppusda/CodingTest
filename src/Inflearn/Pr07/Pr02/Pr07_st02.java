package Inflearn.Pr07.Pr02;

public class Pr07_st02 {
    public void DFS(int n){

        if(n == 0){
            return;
        }else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        Pr07_st02 pr = new Pr07_st02();
        pr.DFS(11);
    }
    /**
     * 이전 문제의 재귀를 활용한 문제이다.
     * 재귀가 되는 값은 n/2로 줄여주며
     * 나머지가 되는 값은 StackFrame에 담아두어 대기 상태에 빠지게 하고
     * 1 1 0 1 이 될 값을
     * 1 0 1 1 로 출력하게 된다.
     */
}
