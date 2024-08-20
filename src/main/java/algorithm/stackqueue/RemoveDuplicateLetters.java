package algorithm.stackqueue;

import java.util.*;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        List<Character> list = new ArrayList<>(set);

        list.sort(Character::compareTo);

        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();
        removeDuplicateLetters.removeDuplicateLetters("abacdcbc");
    }
}
