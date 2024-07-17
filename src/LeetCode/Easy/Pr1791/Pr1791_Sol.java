package LeetCode.Easy.Pr1791;

public class Pr1791_Sol {
    public int findCenter(int[][] edges) {
        int edge1U = edges[0][0];
        int edge1V = edges[0][1];

        int edge2U = edges[1][0];
        int edge2V = edges[1][1];

        if(edge1U == edge2U)
            return edge1U;
        else if(edge1U == edge2V)
            return edge1U;
        else
            return edge1V;
    }
}
