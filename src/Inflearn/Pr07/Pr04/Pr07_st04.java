package Inflearn.Pr07.Pr04;

public class Pr07_st04 {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n] > 0){
            return fibo[n];
        }
        if(n==1){
            return fibo[n] = 1;
        }else if(n == 2){
            return fibo[n] = 1;
        }else{
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }

    }

    public static void main(String[] args) {
        Pr07_st04 pr = new Pr07_st04();

        int n = 45;
        fibo = new int[n+1];
        pr.DFS(n);
        for(int i = 1; i <= n; i++){
            System.out.print(fibo[i] + " ");
        }

    }
    /**
     * (for문과 재귀의 차이점을 잘 학습하자)
     *
     * DFS(5) = DFS(3) + DFS(4)
     * DFS(4) = DFS(2) + DFS(3)
     * DFS(3) = DFS(1) + DFS(2)
     * DFS(2) = 1
     * DFS(1) = 1
     *
     * 이므로 DFS(5) = 5가 된다.
     *
     * 중간의 계산식을 출력해야 할 때
     * 얼핏하면 for문을 통해서 해결하는 방법도 있지만 생각보다 오래 걸린다는 문제가 있다.
     *
     * DFS(5)는 DFS(3) + DFS(4) 인데,
     * DFS(3)은 2번의 재귀, DFS(4)에서는 3번의 재귀가 이루어진다.
     * 이게 숫자가 작을 때는 괜찮지만, 45와 같이 커지게 되면 for문을 통한 DFS 출력은
     * 수많은 재귀를 통해서 시간이 소요되게 된다.
     *
     * 이를 해결하기 위해서
     * static으로 배열을 하나 생성하여 한 번의 DFS가 실행되는 순간순간 return 값들을 저장하게 되고
     * 그걸 출력하게 되어 더 시간 단축을 할 수 있다.
     *
     * 또한, 배열을 모두 0으로 초기화 시켜놓고
     * 0보다 큰 값을 찾으면 할당하는 방법을 이용해서
     * 시간 단축이 가능하다.
     */
}
