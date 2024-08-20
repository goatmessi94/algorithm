package self;

import algorithm.linkedlist.ListNode;

public class Temp155 {
    public void quicksort(ListNode head, ListNode tail) {
        // 단일 노드일때는 그냥 리턴
        if (head == tail) return;
        // 연결 리스트이기 때문에 로무토 파티션이 아닌 편의상 첫 번째 노드를 피벗으로 선택
        ListNode pivot = head;
        // 왼쪽 포인터는 첫 번째 노드
        ListNode left = head;
        // 오른쪽 포인터는 그다음 노드
        ListNode right = head.next;

        // 오른쪽 포인터가 맨 끝에 도달할 때까지 진행
        while (right != tail) {
            if (right.val < pivot.val) {
                // 왼쪽 포인터 진행
                left = left.next; //2, 3
                // 스왑, 연결 리스트이므로 노드 처리를 단순하게 하기 위해 값만 교환
                int temp = left.val; //2 , 3
                left.val = right.val; //2 , 3
                right.val = temp; //2, 3
            }
            // 오른쪽 포인터 진행
            right = right.next; //3 , 4
            showList(head);
        }
        // 피벗과 왼쪽 포인터 값 교환, 피벗은 첫 번째 노드
        int temp = head.val;
        head.val = left.val;
        left.val = temp;
        showList(head);

        // 왼쪽 포인터를 중심으로 분할하여 재귀 호출
        quicksort(head, left);
        quicksort(left.next, tail);
    }

    public ListNode sortList(ListNode head) {
        // 연결 리스트의 마지막은 널이므로 tail을 null로 하여 호출
        quicksort(head, null);
        // 정렬이 끝나면 첫 번째 노드인 head를 결과로 리턴
        return head;
    }

    public void showList (ListNode li) {
        System.out.println(" 리스트 보여주기 시작");
        while (li != null) {
            System.out.print(li.val + " --> ");
            li = li.next;
        }
        System.out.println(" 리스트 보여주기 종료");
    }

    public static void main(String[] args) {
        Temp155 temp155 = new Temp155();
        temp155.sortList(new ListNode(5, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(0, null))))));
    }
}
