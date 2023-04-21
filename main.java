import java.util.Scanner;

import DataStructure.LinkedList;
import DataStructure.ListNode;
import FastAndSlow.circularArray;
import FastAndSlow.palindromeLinkedList;

public class main {
    public static void main(String[] args) {
        
        palindromeLinkedList list = new palindromeLinkedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(1);

        boolean result = list.isPalindrome(node);
        System.out.println(result);
    }
}
