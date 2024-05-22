package algorithm.str;

import java.util.*;
//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        // 1. start 인덱스가 end 인덱스 보다 작은 경우에만 반복
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            if (Character.isLetterOrDigit(s.charAt(startIndex))) {
                startIndex++;
            } else if (Character.isLetterOrDigit(s.charAt(endIndex))) {
                endIndex--;
            } else {
                if (Character.toLowerCase(s.charAt(startIndex)) != Character.toLowerCase(s.charAt(endIndex))) return false;
            }

            startIndex++;
            endIndex--;
        }

        return true;
    }

    public static void main(String[] args) {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.isPalindrome("");
    }
}
