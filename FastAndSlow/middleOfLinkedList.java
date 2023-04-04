package FastAndSlow;

import DataStructure.ListNode;

public class middleOfLinkedList {
    public ListNode middle(ListNode head){
        int len = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(head != null){
            len++;
            head = head.next;
        }
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return (len % 2 == 1) ? slow : slow.next;
    }
}
