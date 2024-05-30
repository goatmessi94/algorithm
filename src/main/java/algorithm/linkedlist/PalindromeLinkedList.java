package algorithm.linkedlist;

import java.awt.*;
import java.util.Stack;

//https://leetcode.com/problems/palindrome-link-list/

public class PalindromeLinkedList {

        static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            ListNode node = head;

            while (node != null) {
                stack.add(node.val);
                node = node.next;
            }

            while (head != null) {
                if (head.val == stack.pop()) {
                    head = head.next;
                } else {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));

        }

}
