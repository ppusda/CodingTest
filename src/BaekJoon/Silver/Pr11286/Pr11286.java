package BaekJoon.Silver.Pr11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Pr11286 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> { // Priority Queue에 넣는 값들의 우선순위 부여 방법
            int absX = Math.abs(x);
            int absY = Math.abs(y);

            if(absX == absY) { // 절댓값이 서로 같을 때
                if(x <= y) { // x가 y보다 작거나 같을 경우
                    return -1; // x에 우선순위 부여
                } else{
                    return 1; // y에 우선순위 부여
                }
            }else if(absX < absY){ // x의 절댓값이 y보다 작을 때
                return -1; // x에 우선순위 부여
            }else{ // x의 절댓값이 y보다 클 때
                return 1; // y에 우선순위 부여
            } // 작은 것부터 출력해야하므로 우선순위를 x에 부여한다.
        });
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i < size; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if(tmp == 0) {
                if(pq.isEmpty()) {
                    sb.append(0).append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else {
                pq.offer(tmp);
            }
        }

        System.out.print(sb);
    }
}
