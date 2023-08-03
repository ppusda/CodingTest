package BaekJoon.Silver.Pr2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Pr2606 {
    public static int[][] network;
    public static int[] visit;
    public static int size;
    public static Set<Integer> answerSet = new HashSet<>();

    public static int dfs(int n) {
        for(int i = 1; i < size; i++) {
            if(network[n][i] == 1 && visit[i] == 0 && i!=n) {
                answerSet.add(i);
                visit[i] = 1;
                dfs(i);
                visit[i] = 0;
            }
        }
        return answerSet.size()-1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine())+1;
        network = new int[size][size];
        visit = new int[size];

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
