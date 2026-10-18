class Solution {
    ListNode reverse(ListNode head){
        ListNode c=head;
        ListNode f=head;
        ListNode p=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            
            p=c;
            c=f;

        }
        return p;
    }
    public ListNode removeNodes(ListNode head) {

        ListNode temp=head;
       temp= reverse(temp);
          ListNode i=temp;
         
    

        while(i!=null && i.next!=null){
            ListNode j= i.next;
            while( j!=null && j.val<i.val ) j=j.next;
            i.next=j;
            i=j;
        }
        return reverse(temp);

    }
}