package FastAndSlow;

import DataStructure.LinkedList;
import DataStructure.ListNode;

public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode slow = head;                       
        ListNode fast = head;                  
        while(fast != null && fast.next != null){
            slow = slow.next;                       
            fast = fast.next.next;                  
        }
        ListNode mid = LinkedList.reverseLinkedList(slow);
        slow = head;
        while(slow != null && mid != null) {
            if(slow.data != mid.data)
                return false;
            slow = slow.next;
            mid = mid.next;
        }
        return true;
    }
}

/*
 * Constraints:
 * 1. The number of nodes in the list is in the range [1, 500]
 * 2. Node values from 0 to 9
 * 
 * Time Complexity:
 * O(N) as it iterates over the Linked List once.
 * 
 * Space Complexity:
 * O(1) as it uses constant space.
 */
