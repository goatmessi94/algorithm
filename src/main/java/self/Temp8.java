package self;

import java.util.*;
import java.util.stream.Collectors;

public class Temp8 {

    // 결과 저장 리스트 선언
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        // 자바 8+의 스트림을 이용해 int[]를 List<Integer>로 변경
        List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());
        // DFS 시작
        dfs(new ArrayList<>(), lst);

        return results;
    }


    public void dfs(List<Integer> prevElements, List<Integer> elements) {
        // 리프 노드에 도달하면 결과에 추가
        if (elements.isEmpty()) {
            // 자바 8+의 스트림을 이용해 prevElements의 내용을 결과에 삽입
            results.add(new ArrayList<>(prevElements));
        }

        // 전달받은 엘리먼트를 모두 탐색
        for (Integer e : elements) {
            // 전달받은 엘리먼트에서 현재 엘리먼트를 제외하고 nextElements로 새롭게 구성
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            // prevElements는 기존 값에 현재 엘리먼트 추가
            prevElements.add(e);
            // 재귀 DFS
            dfs(prevElements, nextElements);
            // 돌아온 이후에는 prevElements에서 현재 엘리먼트 삭제
            prevElements.remove(e);
        }
    }
}
