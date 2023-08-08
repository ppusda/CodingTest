package BaekJoon.Silver.Pr1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pr1697_Check {
    private static int target, answer = 0;
    private static int[] dis = new int[]{1, -1, 2};
    private static List<Integer> list = new ArrayList<>();
    private static Queue<Integer> queue = new LinkedList<>();

    private static int bfs(int n) {
        list.add(n);
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
                    if(tot >= 1 && tot <= 100000 && !list.contains(tot)) {
                        list.add(tot);
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
 *  궁금해서 해 본 Check 자료구조를 list의 contains로 변경
 *  시간 초과 났다... ㅋㅋㅋㅋㅋㅋ
 */