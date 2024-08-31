package BaekJoon.Gold.Pr15686;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Pr15686 {

    private static int N, M;

    private static int[][] graph;
    private static ArrayList<Point> chicken = new ArrayList<>();
    private static ArrayList<Point> house = new ArrayList<>();

    private static boolean[] check;
    private static int answer = 0;

    static class Point{
        int x,y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                graph[i][j] = num;
                if (num == 2) chicken.add(new Point(i, j));
                else if (num == 1) house.add(new Point(i, j));
            }
        }

        answer = Integer.MAX_VALUE;
        check = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(answer);
    }

    private static void dfs(int depth, int start) { // 치킨집 개수를 고르기 위한 depth, 해당 치킨 집 다음 부터 다음 치킨 집을 고르기 위한 start
        if (depth == M) { // 치킨집을 최대 개수만큼 선택했을 경우
            int sum = 0; // 위 경우에 모든 집과의 치킨 집 거리를 담기 위한 변수
            for (int i = 0; i < house.size(); i++) { // 모든 집에 대한 치킨집 거리를 계산
                int min = Integer.MAX_VALUE; // 다른 치킨 집 거리 중 최소값
                for (int j = 0; j < chicken.size(); j++) {
                    if (check[j]) {
                        min = Math.min(Math.abs(house.get(i).x - chicken.get(j).x) + Math.abs(house.get(i).y - chicken.get(j).y), min); // 치킨집 거리 계산
                    }
                }
                sum += min;
            }
            answer = Math.min(sum, answer);
        }

        for (int i = start; i < chicken.size(); i++) {
            check[i] = true;
            dfs(depth+1, i+1);
            check[i] = false;
        }
    }
}
// 본 문제의 핵심은 치킨 집, 집을 따로 ArrayList에 담아서 보관하는데 있다고 생각한다.
// 백트래킹에 걸맞게 치킨 집 선택 자체만 DFS에 맡기고, 계산 자체는 좌표를 모두 기록해두고 계산하면 훨씬 편하게 문제를 해결할 수 있다.
