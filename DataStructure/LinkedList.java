package DataStructure;

public class LinkedList {
    public ListNode head;
    
    public LinkedList() {
        this.head = null;
    }

    public ListNode insertOnTail(ListNode node, ListNode head){
        ListNode copyOfHead = head;
        while(copyOfHead.next != null)
            copyOfHead = copyOfHead.next;
        copyOfHead.next = node;
        return head;
    }
}
