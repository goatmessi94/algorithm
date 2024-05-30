package algorithm.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//https://leetcode.com/problems/palindrome-link-list/
//데크를 이용한 풀이

public class PalindromeLinkedListDe {

        static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public boolean isPalindrome(ListNode head) {
            Deque<Integer> dq = new LinkedList<>();
            ListNode node = head;
            while (node != null) {
                dq.offer(node.val);
                node = node.next;
            }

            while (dq.size() > 1 && dq.peek() == dq.peekLast()) {
                dq.poll();
                dq.pollLast();
            }

            return dq.size() <= 1;
        }

        public static void main(String[] args) {
            ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
            PalindromeLinkedListDe pe = new PalindromeLinkedListDe();
            pe.isPalindrome(list);
        }

}
