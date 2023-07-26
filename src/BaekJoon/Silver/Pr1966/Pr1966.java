package BaekJoon.Silver.Pr1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int time = Integer.parseInt(br.readLine());

        for(int i = 0; i < time; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int len = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            int[] arr = new int[len];
            StringTokenizer arrSt = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < len; j++){
                int n = Integer.parseInt(arrSt.nextToken());
                pq.offer(n);
                arr[j] = n;
            }

            int answer = 0;
            boolean flag = true;
            while(flag){
                for(int j = 0; j < len; j++) {
                    if(pq.peek() == arr[j]) {
                        pq.poll();
                        answer++;
                        if(target == j) {
                            flag = false;
                            break;
                        }
                    }
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}
/**
 * 이전 문제와 유사한 형태의 문제
 *
 *             int answer = 0;
 *             boolean flag = true;
 *             while(flag){
 *                 for(int j = 0; j < len; j++) {
 *                     if(pq.peek() == arr[j]) {
 *                         pq.poll();
 *                         answer++;
 *                         if(target == j) {
 *                             flag = false;
 *                             break;
 *                         }
 *                     }
 *                 }
 *             }
 *
 * 위 문법을 잘 기억해두어야 좋을 것 같다.
 */