import java.util.Scanner;

import DataStructure.LinkedList;
import DataStructure.ListNode;
import FastAndSlow.linkedListCycle;
import FastAndSlow.middleOfLinkedList;

public class main {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        LinkedList list = new LinkedList();
        ListNode head = node;
        middleOfLinkedList middle = new middleOfLinkedList();
        ListNode mid = middle.middle(head);
        System.out.println(mid.data);
    }
}
