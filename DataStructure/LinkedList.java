package DataStructure;

public class LinkedList {
    public ListNode head;
    // Head node of the Linked List

    public LinkedList() {
        this.head = null;
    }
    // Blank Constructor for the Linked List

    public ListNode insertOnTail(ListNode node, ListNode head){
        ListNode copyOfHead = head;
        while(copyOfHead.next != null)
            copyOfHead = copyOfHead.next;
        copyOfHead.next = node;
        return head;
    }
    // Method to insert at the tail of the Linked List

    public void insertOnHead(ListNode node){
        if(this.head == null)
            this.head = node;
        else{
            node.next = this.head;
            this.head = node;
        }
    }
    // Method to insert at the head of the Linked List

    public void createCycle(int start, int end, ListNode node){
        ListNode ref = node;
        while(start != 1){
            start--;
            node = node.next;
        }
        ListNode cycleStart = node;
        node = ref;
        while(end != 1){
            end--;
            node = node.next;
        }
        cycleStart.next = node;
    }

    public void printList(ListNode node){
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("end");
    }
}
