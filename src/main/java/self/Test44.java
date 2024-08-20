package self;

import algorithm.util.TreeNode;

import java.util.*;

public class Test44 {
    private List<TreeNode>[] memo;

    public List<TreeNode> allPossibleFBT(int n) {
        memo = new List[n + 1];
        return dfs(n);
    }

    private List<TreeNode> dfs(int n) {
        if (memo[n] != null) {
            return memo[n];
        }

        if (n==1) {
            return List.of(new TreeNode(0));
        }

        List<TreeNode> result = new ArrayList<>();

        for (int i = 0; i < n - 1; ++i) {
            int j = n - 1 - i;

            if ((i % 2) != 0 || (j % 2) == 0) {
                for (TreeNode leftSubtree : dfs(i)) {
                    for (TreeNode rightSubtree : dfs(j)) {
                        result.add(new TreeNode(0, leftSubtree, rightSubtree));
                    }
                }
            }
        }

        return memo[n] = result;
    }

    public static void main(String[] args) {
        Test44 test44 = new Test44();
        List<TreeNode> treeNodes = test44.allPossibleFBT(3);

        for (TreeNode treeNode:treeNodes) {
            System.out.println(treeNode.val);
        }
    }
}
