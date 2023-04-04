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
            System.out.print(node.data + "-");
            node = node.next;
        }
        System.out.print("end");
    }
}
