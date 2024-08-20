package algorithm.linkedlist;

import java.math.BigInteger;

public class AddTwoNumbers {
    public ListNode reverse(ListNode head) {
        ListNode pre = null, node = head;

        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;

            node = next;
        }

        return pre;
    }
}
