package BaekJoon.Silver.Pr2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr2606_Sol {
    public static int[][] network;
    public static boolean[] visit;
    public static int size, answer;

    public static int dfs(int n) {
        visit[n] = true;

        for(int i = 1; i < size; i++) {
            if(network[n][i] == 1 && !visit[i] && n != i){
                answer ++;
                dfs(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine())+1;
        network = new int[size][size];
        visit = new boolean[size];

        int inNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < inNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            network[a][b] = 1;
            network[b][a] = 1;
        }

        System.out.println(dfs(1));
    }
}
/**
 * 그래프탐색 뼈대 문제
 * 이전에 풀었던 문제와 비슷한 문제로써, visit의 true를 풀지 않음으로 연결되어있는 요소들을 모두 체크할 수 있었다...
 *
 */