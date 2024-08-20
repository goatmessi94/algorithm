package self;

import java.util.*;

public class Temp18 {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(3, 5, 1));
        listOfLists.add(Arrays.asList(4, 4, 3));
        listOfLists.add(Arrays.asList(2, 2, 6));
        listOfLists.add(Arrays.asList(1, 4, 3));
        listOfLists.add(Arrays.asList(5, 4, 3));


        // 인덱스 1의 값을 기준으로 리스트를 정렬
        listOfLists.sort(Comparator.comparing(a -> a.get(1)));

        // 정렬된 리스트 출력
        for (List<Integer> list : listOfLists) {
            System.out.println(list);
        }
    }
}
