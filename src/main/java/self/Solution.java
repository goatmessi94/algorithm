package self;

import java.util.*;
class Solution {
    public int compress(char[] chars) {
        List<Character> list = new ArrayList<>();
    
        Queue<Character> q = new LinkedList<>();
        for (char c : chars) {
            q.add(c);
        }
    
        while (!q.isEmpty()) {
            int count = 1;
            char c = q.poll();
            list.add(c);

            while (!q.isEmpty() && c == q.peek()) {
                count++;
                q.poll();
            }

            String numbers = String.valueOf(count);
            if (!numbers.equals("1")) {
                for (char number : numbers.toCharArray()) {
                    list.add(number);
                }
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }


        return list.size();
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        Solution solution = new Solution();
        solution.compress(chars);
    }
}
