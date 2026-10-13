/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode dummy = new ListNode();
        ListNode d=dummy;
        int carry =0;
        int sum =0;

        while(h1!=null || h2!=null){
            
           if(h1!=null && h2!=null) sum=h1.val+h2.val+carry;
           else if(h1==null) sum=h2.val+carry;
           else sum=h1.val+carry;
                ListNode t=new ListNode(sum%10);
                d.next=t;
                d=d.next;
                carry=sum/10;
                if(h1!=null)h1=h1.next;
               if(h2!=null) h2=h2.next;
        }
        if(carry>0) {
            ListNode t1=new ListNode(carry);
             d.next=t1;
        }
       
        return dummy.next;

    }
}