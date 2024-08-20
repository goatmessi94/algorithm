package algorithm.stackqueue;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<CustomMap> list = new ArrayList<>();

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            list.add(new CustomMap(key, map.get(key)));
        }

        list.sort(((o1, o2) -> {
            if (o2.value == o1.value) {
                return o1.key.compareTo(o2.key);
            } else {
                return o2.value.compareTo(o1.value);
            }
        }));

       return list.stream()
               .limit(k)
               .map(customMap -> customMap.key)
               .collect(Collectors.toList());
    }

    static class CustomMap {
        String key;
        Integer value;

        CustomMap(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        topKFrequentWords.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2);
    }
}
