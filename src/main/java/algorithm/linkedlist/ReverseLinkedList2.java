package algorithm.linkedlist;

//https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList2 {

    public ListNode reverseList(ListNode head) {
        ListNode preNode = null, node = head;

        while (node != null) {
            ListNode next = node.next;

            node.next = preNode;
            preNode = node;
            node = next;
        }
        return preNode;
    }

    public static void main(String[] args) {
        ReverseLinkedList2 reverseLinkedList = new ReverseLinkedList2();
        reverseLinkedList.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode())))))));
    }
}
