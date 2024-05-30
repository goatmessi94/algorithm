package algorithm.linkedlist;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode())));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode())));
        ListNode answer = mergeTwoSortedList.mergeTwoLists(listNode1, listNode2);
        while (answer != null) {

            System.out.println(answer.val); //왜 0ㅇ이 나오는데 정답임?
            answer = answer.next;
        }
    }
}
