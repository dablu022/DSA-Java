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
public ListNode deleteMiddle(ListNode head) {
      ListNode slow= head;
      ListNode fast= head;
      int n=0;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       n++;
      }
    
      if(n==0) return head =null;
     
      //if(n==2) return head.next=null;
      slow=head;
      fast=head;
     for(int i=0;i<n-1;i++){
        slow=slow.next;
     }
     slow.next=slow.next.next;
     return head;

    }
}