package self;

import java.util.*;
public class Solution33 {
    Map<Integer, List<Integer>> dic = new HashMap<>();
    int count = 0;

    public int solution(int n, int[][] computers) {

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (i == j) continue;
                dic.putIfAbsent(i, new ArrayList<>());
                dic.get(i).add(j);
            }
        }

        System.out.println(dic.get(0));

        for (int key : dic.keySet()) {
            bfs(key);
        }

        return count;
    }

    public void bfs(int key) {
        System.out.println(dic.get(key));

        Queue<Integer> q = new LinkedList<>();
        q.add(key);

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int e : (List<Integer>) dic.get(cur)) {
                System.out.println(e);
                q.add(e);
                dic.get(cur).remove((Object) e);
            }
        }

        count += 1;
    }

    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        solution33.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
    }
}
