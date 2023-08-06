package BaekJoon.Silver.Pr11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Pr11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
        for(int i = 0; i < size; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }else {
                    sb.append(pq.poll()).append("\n");
                }
            }else {
                pq.offer(n);
            }
        }

        System.out.print(sb);
    }
}