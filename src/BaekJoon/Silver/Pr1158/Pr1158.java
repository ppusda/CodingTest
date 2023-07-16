package BaekJoon.Silver.Pr1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int chk = 0;

        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[len];
        for(int i = 1; i < len+1; i++){
            queue.add(i);
        }

        for(int i = 0; i < len; i++){
            for(int j = 0; j < k-1; j++) {
                queue.add(queue.poll());
            }
            if(!queue.isEmpty()){
                arr[i] = queue.poll();
            }
        }

        sb.append("<");
        for(int n = 0; n < arr.length; n++){
            if(n == arr.length-1) {
                sb.append(arr[n]);
            }else{
                sb.append(arr[n]).append(", ");
            }
        }
        sb.append(">");
        System.out.print(sb);
    }
}
