public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode revNode=slow;

        ListNode prev=null;
        while(revNode!=null){
            ListNode temp = revNode.next;

            revNode.next=prev;
            prev=revNode;
            revNode=temp;

        }
        while(prev!=null){
            if(prev.val!=head.val)return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
    }



     public class ListNode {
        int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

}
