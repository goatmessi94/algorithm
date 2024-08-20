package self;

import java.util.*;
import java.util.stream.Collectors;

public class Temp9 {
    // 결과 저장 리스트 선언
    List<List<Integer>> results = new ArrayList<>();
    int n;
    public List<List<Integer>> combine(int n, int k) {

        this.n = n;
        // DFS 시작
        dfs(new LinkedList<>(),1, k);

        return results;
    }
    public void dfs(LinkedList<Integer> elements, int start, int k) {
        // k번째 노드에 도달하면 결과에 추가
        if (k == 0) {
            // 자바 8+의 스트림을 이용해 elements의 내용을 결과에 삽입
            results.add(elements.stream().collect(Collectors.toList()));
            return;
        }

        // 현재 엘리먼트 이후 엘리먼트 탐색
        for (int i = start; i <= n; i++) {
            // 전달받은 엘리먼트에 더해 현재 엘리먼트 추가
            elements.add(i);
            // 재귀 DFS
            dfs(elements, i + 1, k - 1);
            // 돌아온 이후에는 현재 엘리먼트 삭제
            elements.removeLast();
        }
    }

    public static void main(String[] args) {
        Temp9 temp9 = new Temp9();
        List<List<Integer>> result = temp9.combine(5, 3);
//
//        for (int i = 0; i < result.size(); i++) {
//            for (int j = 0; j < result.get(i).size(); j++) {
//                System.out.print(result.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
    }
}
