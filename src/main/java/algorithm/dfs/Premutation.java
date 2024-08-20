package algorithm.dfs;

import java.util.*;
import java.util.stream.Collectors;

public class Premutation {
    public void dfs(List<List<Integer>> results, List<Integer> prevElements, List<Integer> elements) {
        if (elements.isEmpty()) {
            results.add(prevElements.stream().collect(Collectors.toList()));
        }

        for (Integer e : elements) {
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            prevElements.add(e);
            dfs(results, prevElements, nextElements);
            prevElements.remove(e);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());

        //DFS 시작
        dfs(results, new ArrayList<>(), lst);
        return results;
    }

    public static void main(String[] args) {
        Premutation premutation = new Premutation();
    }
}
