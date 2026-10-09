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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int max=0;
        int ans=0;
        if(head.next.next == null) return head.val+head.next.val;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode h=head;
        ListNode h1=new ListNode();
        h1=slow.next;
        h1=reverse(h1);
        slow.next=null;

    while(h1!=null){
        ans=h.val + h1.val;
        max=Math.max(ans,max);
        h=h.next;
        h1=h1.next;
        
    }
    return max;

    }
}