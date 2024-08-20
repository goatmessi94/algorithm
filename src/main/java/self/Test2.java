package self;

import algorithm.util.TreeNode;

public class Test2 {
    int prev = Integer.MIN_VALUE + 100000;

    // 노드 간 차이 최솟값, 가장 큰 수로 설정
    int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        // 왼쪽 자식 노드 맨 아래까지 탐색
        if (root.left != null) minDiffInBST(root.left);

        // 현재 노드 값과 이전 노드 값의 차이를 구하고 최솟값인지 확인
        minDiff = Math.min(minDiff, root.val - prev);

        System.out.println(root.val);
        System.out.println(prev);
        System.out.println(root.val - prev);
        // 현재 노드 값을 이전 노드 값으로 설정
        prev = root.val;

        // 오른쪽 자식 노드 재귀 탐색
        if (root.right != null) minDiffInBST(root.right);
        // 최솟값을 결과로 리턴
        return minDiff;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10, new TreeNode(4, new TreeNode(1, null, null), new TreeNode(8, new TreeNode(7, null, null), null)), new TreeNode(16, null, new TreeNode(19, null, null)));
        Test2 test2 = new Test2();
//        System.out.println(Integer.MIN_VALUE + 100000);
//        int prev = Integer.MIN_VALUE + 100000;
//        System.out.println(1 - prev);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(-Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int prev = Integer.MIN_VALUE + 100000;
        System.out.println(-prev);
//        System.out.println(Integer.MIN_VALUE);



//        System.out.println(test2.minDiffInBST(treeNode));
//        System.out.println(Math.min(4-3, 1 - Integer.MIN_VALUE +100000));

//        System.out.println(Math.min(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
