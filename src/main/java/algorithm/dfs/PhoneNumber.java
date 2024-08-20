package algorithm.dfs;

import java.util.*;

public class PhoneNumber {

    List<String> result = new ArrayList<>();
    Map<Character, List<Character>> dic = new HashMap<>();
    public void dfs( String digits, int index, StringBuilder path) {

        // 끝까지 탐색했으면 저장하고 리턴
        if (path.length() == digits.length()) { //24면 "ab"와 같은 두글자니까 path의 길이와 동일하면 add하고 return 하는 것
            result.add(String.valueOf(path));
            return;
        }

        for (Character c : dic.get(digits.charAt(index))) { //0이면 24면 === 2, dic.get(2), List<Character>
            dfs(digits, index + 1, new StringBuilder(path).append(c)); //
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return result;

        dic.put('0', List.of());
        dic.put('1', List.of());
        dic.put('2', List.of('a','b','c'));
        dic.put('3', List.of('d','e','f'));
        dic.put('4', List.of('g','h','i'));
        dic.put('5', List.of('j', 'k', 'l'));
        dic.put('6', List.of('m', 'n', 'o'));
        dic.put('7', List.of('p', 'q', 'r', 's'));
        dic.put('8', List.of('t', 'u', 'v'));
        dic.put('9', List.of('w', 'x', 'y', 'z'));

        //결과 담을 배열, 사전, 찾을 번호 "24", 인덱스, "경로"(path)
        dfs( digits, 0, new StringBuilder());

        return result;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.letterCombinations("24");
    }
}
