
class Solution {
    public ListNode reverse(ListNode head){
        ListNode f=head;
        ListNode c=head;
        ListNode p=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }

    public boolean isPalindrome(ListNode head) {
       ListNode slow=head; 
       ListNode fast=head;
     
    if(head == null || head.next==null) return true;
       ListNode a=new ListNode();

       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }

       a=slow.next;
       slow.next=null;
        a=reverse(a);
        ListNode t=a;
        ListNode t1=head;

       while(t!=null ){
        if(t1.val!=t.val) return false;
        t1=t1.next;
        t=t.next;
       }
       return true;

    }
}