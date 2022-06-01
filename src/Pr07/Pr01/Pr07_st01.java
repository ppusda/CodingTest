package Pr07.Pr01;


/**
 * DFS 학습 1
 */

public class Pr07_st01 {
    public void DFS(int n){
        if(n==0) {
            return;
        }else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Pr07_st01 pr = new Pr07_st01();
        pr.DFS(3);
    }

    /**
     * 재귀함수는 StackFrame을 사용한다.
     *
     * System.out.print(n + " ");
     * DFS(n-1);
     *
     * 위 부분을 코드로 실행하면 3 2 1의 결과가 나오게 되지만
     *
     * DFS(n-1);
     * System.out.print(n + " ");
     *
     * 위 처럼 수정한 후 구동하게 되면  1 2 3의 결과가 나오게 된다.
     *
     * 이를 가능하게 한 건 스택 프레임 때문이다.
     * 스택 프레임은 함수가 호출될 때 그 함수만의 스택 영역을 구분하기 위해 생성되는 공간이다.
     * 이 공간에서는 함수 호출 시 함수와 관계되는 지역 변수, 매개 변수가 저장되고
     * 함수 종료 시 소멸된다.
     *
     * 이를 이용한 결과 출력이되는 것이다.
     * 재귀 함수가 실행되면서 출력되는 코드는 후에 구동이 되고 stackframe 영역에 쌓이게 된다.
     * 위 코드에서는 DFS(3) 함수 실행 |
     * 3 출력, DFS(2) 함수 실행 |
     * 2 출력, DFS(1) 함수 실행 |
     * 1 출력, DFS(0) 함수 실행이 되었다면,
     *
     * 아래 코드에서는 DFS(3) 함수 실행, DFS(2) 함수 실행, DFS(1) 함수 실행, DFS(0) 함수 실행이후
     * DFS(1)의 결과 1 출력 |
     * DFS(2)의 결과 2 출력 |
     * DFS(3)의 결과 3 출력으로 이루어지게 된다.
     *
     *
    */
}
