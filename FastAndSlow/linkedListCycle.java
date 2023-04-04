package FastAndSlow;

import DataStructure.ListNode;

public class linkedListCycle {
    public boolean isCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
