package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pr797 {

    private static List<List<Integer>> answer;
    private static List<Integer> temp;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        answer = new ArrayList<>();
        temp = new ArrayList<>();
        dfs(0, graph);
        return answer;
    }

    private void dfs(int n, int[][] graph) {
        temp.add(n);

        if (n == graph.length - 1) {
            answer.add(new ArrayList<>(temp));
        } else {
            for (int gn : graph[n]) {
                dfs(gn, graph);
            }
        }
        temp.remove(temp.size() - 1);
    }
}
