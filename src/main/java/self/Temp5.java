package self;

import algorithm.linkedlist.ListNode;

import java.util.PriorityQueue;

public class Temp5 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.val == o2.val)
                return 0;
            else if (o1.val > o2.val)
                return 1;
            else
                return -1;
        });

        ListNode root = new ListNode(0);
        ListNode tail = root;

        for (ListNode node : lists)
            if (node != null)
                pq.add(node);

        while (!pq.isEmpty()) {
            tail.next = pq.poll();
            tail = tail.next; // 한칸 앞으로 가는것
            if (tail.next != null)
                pq.add(tail.next);
        }

        return root.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(4, new ListNode(5, null)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode listNode3 = new ListNode(2, new ListNode(7, null));

        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = listNode1;
        listNodes[1] = listNode2;
        listNodes[2] = listNode3;

        Temp5 temp5 = new Temp5();
        temp5.mergeKLists(listNodes);
    }
}
