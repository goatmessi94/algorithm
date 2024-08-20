package algorithm.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    char[][] globalGrid;
    boolean[][] visited;

    int[] moveX = {-1, 0, 0, 1};
    int[] moveY = {0, -1, 1, 0};

    public int numIslands(char[][] grid) {

        globalGrid = grid;
        visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }
        return count;
    }

    public void bfs(int y, int x) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();
            for (int i = 0; i < 4; i++) {
                int movingX = node.x + moveX[i];
                int movingY = node.y + moveY[i];

                if (movingX >= 0 && movingX < globalGrid[0].length && movingY >= 0 && movingY < globalGrid.length) {
                    if (!visited[movingY][movingX] && globalGrid[movingY][movingX] == '1') {
                        q.offer(new Node(movingX, movingY));
                        visited[movingY][movingX] = true;
                    }
                }
            }
        }
    }

    static class Node {
        int x;
        int y;

        Node (int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        System.out.println(numberOfIslands.numIslands(new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}));
        System.out.println(numberOfIslands.numIslands(new char[][]{{'1','0','1','1','0','1','1'}}));
    }
}
