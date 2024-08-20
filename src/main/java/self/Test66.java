package self;

import algorithm.util.TreeNode;

public class Test66 {
    int[] preorder;
    int[] inorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 재귀 DFS 진행, 초깃값은 전위 순회 인덱스: 0, 중위 순회 인덱스 시작: 0, 종료: 길이 - 1
        this.preorder = preorder;
        this.inorder = inorder;

        return dfs(0, 0, inorder.length - 1, false);
    }

    public TreeNode dfs(int preIndex, int inStart, int inEnd , boolean right) {
        // 예외 처리
        if (preIndex > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        // 전위 순회 값이 중위 순회에서는 몇 번째 인덱스인지 추출
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preIndex]) {
                inIndex = i;
            }
        }
        // 해당 인덱스는 중위 순회를 분할하는 노드로 지정
        TreeNode node = new TreeNode(inorder[inIndex]);
        // 전위 순회 다음 결과를 보도록 인덱스 +1
        preIndex++;

//        if (right) {
//            System.out.print( "현재값 = " +inorder[inIndex]+"의 RIGHT preIndex = " + preIndex + ", inIndex = " + inIndex + ", inStart = " + inStart);
//            System.out.println();
//        } else {
//            System.out.print("현재값 = " +inorder[inIndex]+"의 LEFT preIndex = " + preIndex + ", inIndex = " + inIndex + ", inStart = " + inStart);
//            System.out.println();
//        }
//
        System.out.println( "현재값 = " +inorder[inIndex]+"은 preIndex = " + preIndex + ", inIndex = " + inIndex + ", inStart = " + inStart);
        System.out.println( "LEFT = (" + (preIndex) + ", " + (inStart) + ", " + (inIndex - 1) +")" );
        System.out.println( "RIGHT = (" + (preIndex + inIndex - inStart) + ", " + (inIndex + 1) + ", " + inEnd +")" );
        System.out.println("======================================================================================================================================================");

        // 왼쪽 자식 노드부터 진행
        node.left = dfs(preIndex, inStart, inIndex - 1, false);
        // 나머지 값으로 오른쪽 자식 노드 진행
        node.right = dfs(preIndex + inIndex - inStart, inIndex + 1, inEnd, true);

//        System.out.println( "현재값 = " +inorder[inIndex]+"은 preIndex = " + preIndex + ", inIndex = " + inIndex + ", inStart = " + inStart);
//        System.out.println( "LEFT = (" + (preIndex) + ", " + (inStart) + ", " + (inIndex - 1) +")" );
//        System.out.println( "RIGHT = (" + (preIndex + inIndex - inStart) + ", " + (inIndex + 1) + ", " + inEnd +")" );
//        System.out.println("======================================================================================================================================================");

        return node;
    }

    public static void main(String[] args) {
        Test66 test66 = new Test66();
        test66.buildTree(new int[]{1,2,4,5,3,6,7,9,8}, new int[]{4,2,5,1,7,9,6,8,3});
    }
}
