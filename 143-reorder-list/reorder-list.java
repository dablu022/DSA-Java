
class Solution {
    public ListNode rev(ListNode head){
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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp = new ListNode();
        ListNode t=temp;
        ListNode t1=head;
        t.next=slow.next;
        slow.next=null;
        t=rev(t.next);
        
        ListNode dm=new ListNode();
        ListNode d=dm;

        while(t1!=null){
         d.next=t1;
        t1=t1.next;
         d=d.next;

         d.next=t;
        if(t!=null)  t=t.next;
         d=d.next;
        }
    }
}