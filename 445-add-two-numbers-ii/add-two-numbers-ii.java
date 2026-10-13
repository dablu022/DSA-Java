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
    public ListNode reverse (ListNode head){
        ListNode fv=head;
        ListNode cr=head;
        ListNode pv=null;

        while(cr!=null){
            fv=cr.next;
            cr.next=pv;
            pv=cr;
            cr=fv;
        }
        return pv;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2= l2;

        h1=reverse(h1);
        h2=reverse(h2);
        ListNode ans = new ListNode(-1);
        ListNode a = ans;
        int carry=0;
        int sum =0;


        while(h1!=null || h2!=null){
            if(h1!=null && h2!=null) sum=h1.val+h2.val+carry;
            else if(h1!=null)sum=h1.val+carry;
            else sum=h2.val+carry;
            ListNode t = new ListNode(sum%10);
            carry = sum/10;
            a.next=t;
            a=a.next;
            if(h1!=null) h1=h1.next;
            if(h2!=null) h2=h2.next;
           
       
        }
        if(carry>0){
            ListNode t = new ListNode(carry);
              a.next=t;
        }
       ans= reverse(ans.next);
       return ans;

    }
}