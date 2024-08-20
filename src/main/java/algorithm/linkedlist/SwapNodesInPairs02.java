package algorithm.linkedlist;

public class SwapNodesInPairs02 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);

        ListNode root = node; // node 뒤에 추가할건가

        node.next = head;

        while (node.next != null && node.next.next != null) {

            ListNode a = node.next; // 첫번째

            ListNode b = node.next.next; // 두번째

            a.next = b.next; // a가 c를 가르킴

            node.next = b; // -a가 b를 가르킴
            node.next.next = a;

            node = node.next.next;
        }

        return root.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));

        SwapNodesInPairs02 swapNodesInPairs02 = new SwapNodesInPairs02();
        swapNodesInPairs02.swapPairs(listNode);
    }
}
