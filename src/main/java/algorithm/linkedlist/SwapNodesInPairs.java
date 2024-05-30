package algorithm.linkedlist;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null) {
            int tmp;
            tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;
            node = node.next.next;
        }

        return head;
    }



}
