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
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode t1 =list1;
        ListNode t2 =list2;
        ListNode a= new ListNode(-1);
        ListNode k=a;
        while(t1!=null && t2!= null){
            if(t1.val<=t2.val){ 
                k.next=t1;
                k=k.next;
                t1=t1.next;
            }
            else {
                k.next=t2;
                k=k.next;
                t2=t2.next;
            } 
        }
        if(t1 == null ) k.next=t2;
        else k.next=t1;
       
        return a.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;

        ListNode a=new ListNode();
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        a=slow.next;
        slow.next=null;

      temp=  sortList(temp);
       a= sortList(a);
       return merge(temp,a);

    }
}