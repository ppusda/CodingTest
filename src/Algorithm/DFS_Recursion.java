package Algorithm;

import java.util.Arrays;

public class DFS_Recursion {
    private static int[] array;
    private static boolean[] visited;
    private static int N, M;


    public static void main(String[] args) {
        N = 5;
        M = 2;
        array = new int[N];
        visited = new boolean[N];

        array = new int[] {8, 5, 3, 6, 1};
        Arrays.sort(array);

        DFS(0, 0);
    }

    private static void DFS(int depth, int index) {
        if (depth == M) {
            for (int i = 0; i < N; i++) {
                if (visited[i]) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = index; i < N; i++) {
            visited[i] = true;
            DFS(depth+1, i+1);
            visited[i] = false;
        }
    }
}
