package algorithm.deque;

import algorithm.linkedlist.ListNode;

import java.util.PriorityQueue;

public class MergeK {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
            // 동일한 값이면 무시
            if (o1.val == o2.val)
                return 0;
                // 새로운 값(o1)이 기본 값(o2)보다 크면 뒤에 위치
            else if (o1.val > o2.val)
                return 1;
                // 작으면 앞에 위치
            else
                return -1;
        });

        ListNode root = new ListNode(0);
        ListNode tail = root;

        // 각 연결 리스트의 첫 번째 노드를 큐에 저장
        for (ListNode node : lists)
            if (node != null)
                pq.add(node);

        // 큐가 모두 빌때까지 반복
        while (!pq.isEmpty()) {
            // 우선순위에 따라 추출, 다음 노드로 이동
            tail.next = pq.poll();
            tail = tail.next;

            // 추출한 연결 리스트의 다음 노드는 다시 큐에 저장
            if (tail.next != null) {
                System.out.println(tail.next.val);
                pq.add(tail.next);
            }

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

        MergeK mergeK = new MergeK();
        mergeK.mergeKLists(listNodes);
    }
}
