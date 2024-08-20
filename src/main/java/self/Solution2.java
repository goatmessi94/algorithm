package self;

import java.util.*;

class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int[][] map = new int[][]{{0, 1}, {1,0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int index = 0;
        int count = 0;

        int[] cur = new int[]{0,0}; // 처음 시작은 넣음
        visited[0][0] = true;
        result.add(matrix[0][0]);

        while (count < (matrix.length * matrix[0].length) -1) {
            int[] move = map[index];
            int movingY = cur[0] + move[0];
            int movingX = cur[1] + move[1];

            if (movingY < matrix.length && movingX < matrix[0].length && movingY >= 0 && movingX >= 0) {
                if (!visited[movingY][movingX]) {
                    visited[movingY][movingX] = true;
                    cur = new int[]{movingY, movingX};
                    result.add(matrix[movingY][movingX]);
                    count++;
                } else {
                    index = (index + 1) % 4;
                }
            } else {
                index = (index + 1) % 4;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}
