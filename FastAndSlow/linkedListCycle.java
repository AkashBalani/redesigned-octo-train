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

/*
 * Time Complexity:
 * O(N) as we have to traverse the list atleast once
 * 
 * Space Complexity:
 * O(1) for storing values in the variables
 */
