package algorithm.linkedlist;

//https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {

    public ListNode reverse(ListNode head, ListNode prev) {
        if (head == null)
            return prev;

        ListNode node = head.next;
        head.next = prev;
        return reverse(node, head);
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
}
