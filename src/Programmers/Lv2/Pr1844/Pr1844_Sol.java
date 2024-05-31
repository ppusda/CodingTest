package Programmers.Lv2.Pr1844;

import java.util.LinkedList;
import java.util.Queue;

public class Pr1844_Sol {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // 시작 위치와 거리

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (row == rows - 1 && col == cols - 1) {
                return distance; // 목적지에 도달한 경우 최단거리 반환
            }

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && maps[newRow][newCol] == 1) {
                    maps[newRow][newCol] = 0; // 방문한 위치는 재방문하지 않도록 표시
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                }
            }
        }

        return -1; // 목적지에 도달하지 못한 경우
    }
}
