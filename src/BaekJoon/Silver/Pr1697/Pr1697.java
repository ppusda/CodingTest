package BaekJoon.Silver.Pr1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr1697 {
    private static int target, answer = 0;
    private static int[] dis = new int[]{1, -1, 2};
    private static int[] ch;
    private static Queue<Integer> queue = new LinkedList<>();

    private static int bfs(int n) {
        ch = new int[100001];
        ch[n] = 1;
        queue.offer(n);
        int level = 0;

        if(n == target) {
            return level;
        }

        while (!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++){
                int tmp = queue.poll();
                for(int d: dis) {
                    int tot;
                    if(d == 2){
                        tot = d * tmp;
                    }else{
                        tot = tmp + d;
                    }
                    if(tot == target) {
                        return level+1; // 실제로는 다음 단계에서 탐색되어야하는 tot 이므로 +1을 해주어야만 한다.
                    }
                    if(tot > 0 && tot <= 100000 && ch[tot] == 0) {
                        ch[tot] = 1;
                        queue.offer(tot);
                    }
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n));
    }
}

/**
 * https://www.acmicpc.net/board/view/122899
 * 반례 모음
 */