public class NNodeFromLast {
    
        static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        
        public static void romovenNode(ListNode head,int n){
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            ListNode slow=dummy;
            ListNode fast=dummy;

            for(int i=0;i<n;i++){
                fast=fast.next;

            }
            while(fast != null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }
    }
}
