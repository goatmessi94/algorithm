package algorithm.leetcodeStudy;

import algorithm.util.TreeNode;

import java.util.*;
public class KthSmallest_230 {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int kthSmallest(TreeNode root, int k) {

        dfs(root);

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = pq.poll();
        }

        return result;
    }

    public void dfs (TreeNode node) {
        if (node == null) {
            return;
        }

        pq.offer(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
