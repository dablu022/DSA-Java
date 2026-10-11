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
     public ListNode reverse(ListNode head) {
        ListNode f =head;//forward
        ListNode c =head;//current
        ListNode p =null;//previous

        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right) return head;
        ListNode dummy =new ListNode(-1);
        ListNode d=dummy;
        ListNode h1 =head;
        ListNode h2 =head;
        ListNode h3 =head;
        ListNode t1 = head;
        ListNode t2 = head;
        d.next=head;
        
        for(int i=0;i<left-1;i++){
            d=d.next;
        }
        h2=d.next;
       t1=d;
       

        d=dummy;
        for(int i=0;i<right;i++){
            d=d.next;
        }
      h3=d.next;
      t2=d;
      ListNode tail =h2;

      t1.next=null;
      t2.next=null;
    h2=reverse(h2);
    t1.next=h2;
    tail.next=h3;

    return dummy.next;



    }
}