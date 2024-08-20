package self;

import java.util.*;

public class Letter {

    Map<Character, List<Character>> phone;
    String gDigits;
    List<String> resultList = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        gDigits = digits;

        phone = new HashMap<>();
        phone.put('0', List.of());
        phone.put('1', List.of());
        phone.put('2', List.of('a','b','c'));
        phone.put('3', List.of('d','e','f'));
        phone.put('4', List.of('g','h','i'));
        phone.put('5', List.of('j','k','l'));
        phone.put('6', List.of('m','n','o'));
        phone.put('7', List.of('p','q','r','s'));
        phone.put('8', List.of('t','u','v'));
        phone.put('9', List.of('w','x','y','z'));

        if (digits.equals(""))
            return List.of();

        dfs(0, new String());

        return resultList;
    }

    public void dfs (int depth, String comb) {
        if (gDigits.length() == depth) {
            resultList.add(comb);
            return;
        }

        for (int i = 0; i < phone.get(gDigits.charAt(depth)).size(); i++) {
            dfs(depth + 1, comb.toString() + phone.get(gDigits.charAt(depth)).get(i));
        }
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        System.out.println(letter.letterCombinations("23").toString());
    }
}
