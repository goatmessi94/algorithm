package self;

import java.util.*;

public class Temp16 {
    List<String> result = new ArrayList<>();
    String numbers;
    public int solution(String numbers) {
        this.numbers = new String(numbers);
        dfs(new StringBuilder(""), new StringBuilder(numbers), 0);
        int answer = 0;
        return answer;
    }

    public void dfs(StringBuilder prevElements, StringBuilder nextElements, int index) {
        if (!prevElements.toString().equals("")) {
            result.add(prevElements.toString());
        }

        for (int i = 0; i < nextElements.length(); i++) {  // Loop through nextElements
            StringBuilder newNextElements = new StringBuilder(nextElements);
            newNextElements.deleteCharAt(i);

            char currentChar = nextElements.charAt(i);
            prevElements.append(currentChar);

            dfs(prevElements, newNextElements, index + 1);

            prevElements.deleteCharAt(prevElements.length() - 1);  // Remove the last character
        }
    }

    public static void main(String[] args) {
        Temp16 temp16 = new Temp16();
        temp16.solution("17");
        for (String hello : temp16.result) {
            System.out.println(hello);
        }
    }
}
