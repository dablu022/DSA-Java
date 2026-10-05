
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow =head ;
        ListNode fast = head;
        ListNode t1=head;
        ListNode t2= head;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }
        t1=slow; 
        for(int i=1;i<k;i++){
          t2= t2.next;
        }   
      
       int temp=t1.val;
        t1.val=t2.val;
        t2.val=temp;
        return head;
    }
}