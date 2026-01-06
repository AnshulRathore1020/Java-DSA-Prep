//     Detect a Cycle in a Linked List
// floyd's (hare turtle apporch)
 class ListNode {
    int val;
    ListNode next;
    

    public ListNode(int val) {
        this.val = val;
        this.next = null;

    }

}
public class LinkedListCycle{
   public boolean hascycle(ListNode head){
    if(head == null || head.next == null)
    return false;

    ListNode turtal = head;
    ListNode hear = head;

    while (hear != null && hear.next != null){
    turtal = head.next;
    hear = head.next.next;

if(turtal == hear)
    return true;
    }
    return false;
   }
  
    }
