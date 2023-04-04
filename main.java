import java.util.Scanner;

import DataStructure.LinkedList;
import DataStructure.ListNode;
import FastAndSlow.linkedListCycle;

public class main {
    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        LinkedList list = new LinkedList();
        ListNode head = node;
        list.insertOnTail(new ListNode(3), head);
        list.insertOnTail(new ListNode(5), head);
        list.insertOnTail(new ListNode(9), head);
        list.insertOnTail(new ListNode(11), head);
        list.insertOnTail(new ListNode(17), head);
        linkedListCycle cycle = new linkedListCycle();
        list.createCycle(6, 4, head);
        System.out.println(cycle.isCycle(head));
    }
}
