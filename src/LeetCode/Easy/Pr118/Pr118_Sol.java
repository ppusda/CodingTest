package LeetCode.Easy.Pr118;

import java.util.ArrayList;
import java.util.List;

public class Pr118_Sol {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>(numRows);

        for(int i=1;i<=numRows;i++)
            ans.add(generateRow(i));

        return ans;
    }
    public List<Integer> generateRow(int r){
        List<Integer> rowelements = new ArrayList<>(r);
        int pele=1;
        rowelements.add(pele);
        for(int i=1;i<r;i++){
            pele = pele*(r-i)/i;
            rowelements.add(pele);
        }
        return rowelements;
    }
}
