package algorithm.graph;

import algorithm.util.TreeNode;

import java.util.*;
public class MaximumDepth {

    public int maxDepth(TreeNode root) {


        return 0;
    }


    public static void main(String[] args) {
        MaximumDepth maximumDepth = new MaximumDepth();
        TreeNode treeNode = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(10, new TreeNode(15, null, null), new TreeNode(7, null, null)));

        maximumDepth.maxDepth(treeNode);
    }
}
