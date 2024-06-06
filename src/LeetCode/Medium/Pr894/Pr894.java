package LeetCode.Medium.Pr894;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pr894 {
    private static Map<Integer, List<TreeNode>> memoization = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n%2 == 0) {
            return new ArrayList<>();
        }
        if (memoization.containsKey(n)) {
            return memoization.get(n);
        }

        List<TreeNode> result = new ArrayList<>();

        if (n == 1) {
            result.add(new TreeNode(0));
        } else {
            for (int leftNodes = 1; leftNodes < n; leftNodes+=2) {
                int rightNodes = n-1-leftNodes;
                for (TreeNode left : allPossibleFBT(leftNodes)) {
                    for (TreeNode right : allPossibleFBT(rightNodes)) {
                        TreeNode root = new TreeNode(0);
                        root.left = left;
                        root.right = right;
                        result.add(root);
                    }
                }
            }
        }

        memoization.put(n, result);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Pr894().allPossibleFBT(7));
    }

}
