package algorithm.array;

class Solution {
    public boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (!Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
            } else if (!Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
            } else {
                if (Character.toLowerCase(s.charAt(leftIndex)) != Character.toLowerCase(s.charAt(rightIndex)))
                    return false;

                leftIndex++;
                rightIndex++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome("A man, a plan, a canal: Panama");
    }
}