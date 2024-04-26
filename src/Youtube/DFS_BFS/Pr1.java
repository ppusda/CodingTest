package Youtube.DFS_BFS;

import java.util.Scanner;

public class Pr1 {

    static int row;
    static int column;
    static int[][] graph = new int[1000][1000];

    public int solution() {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        row = sc.nextInt();
        column = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < row; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < column; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (dfs(i, j)) {
                    result ++;
                }
            }
        }

        return result;
    }

    public boolean dfs(int x, int y) {
        if (x <= -1 || x >= row || y <= -1 || y >= column) {
            return false;
        }

        if (graph[x][y] == 0) {
            graph[x][y] = 1;

            dfs(x-1, y); // 왼쪽
            dfs(x, y-1); // 아래쪽
            dfs(x+1, y); // 오른쪽
            dfs(x, y+1); // 위쪽
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1().solution());
    }
}

// DFS, 재귀를 사용함