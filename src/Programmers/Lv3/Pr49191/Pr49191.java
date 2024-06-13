package Programmers.Lv3.Pr49191;

public class Pr49191 {

    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] rank = new int[n+1][n+1];

        // 플로이드 와샬 알고리즘
        for(int[] r:results){
            rank[r[0]][r[1]] = 1; //이김
            rank[r[1]][r[0]] = -1; //짐
        } // 여기까지는 이전에 접근하던 인접행렬과 비슷함

        for(int k=1; k<=n; k++){ // 지금까지의 정보들로 추가적인 승패를 얻을 수 있을지 전체 배열을 확인해보자.
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(rank[i][k]==1 && rank[k][j]==1){ // i번이 k번에게 이긴 정보가 있으며, k번이 j번에게 이긴 정보가 있을 때
                        rank[i][j] = 1; // i번은 j번에게 이긴 것으로 기록하며
                        rank[j][i] = -1; // j번 또한 i번에게 진 것으로 기록한다.
                    }
                }
            }
        }

        for(int i=1; i<=n; i++){ // 이후 승패를 확정지을 수 있는 경우를 찾는다.
            int cnt = 0;
            for(int j=1; j<=n; j++){
                if(rank[i][j]!=0){
                    cnt++;
                }
            }
            if(cnt==n-1){ // 자신을 제외한 모든 이와의 승패가 결정되어 있다면, 등수를 찾을 수 있다.
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr49191().solution(5, new int[][] {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}}));
    }
}
