package FastAndSlow;

import DataStructure.LinkedList;
import DataStructure.ListNode;

public class circularArray {
    public boolean circularArrayLoop(int[] nums){
        ListNode node = new ListNode(nums[0]);
        LinkedList list = new LinkedList();
        for(int i = 1; i < nums.length; i++){
            list.insertOnTail(new ListNode(nums[i]), node);
        }

        list.createCycle(nums.length, 1, node);
        return false;
    }
}
