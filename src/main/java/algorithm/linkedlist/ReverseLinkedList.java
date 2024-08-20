package algorithm.linkedlist;

//https://leetcode.com/problems/reverse-linked-list


import java.util.List;

public class ReverseLinkedList {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode list = reverseLinkedList.reverse(list1);
        System.out.println(list1.val);
        list1  = list1.next;

        System.out.println(list1.val);
    }

    public ListNode reverse(ListNode head) {
        ListNode rev = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = rev;
            rev = node;
            node = next;
        }
        return rev;
    }
}
