/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        int l1=0;
        int l2=0;
        ListNode t1= A;
        ListNode t2= B;

        while(t1!=null){
            t1=t1.next;
            l1++;
        }
          while(t2!=null){
            t2=t2.next;
            l2++;
        }
          t1= A;
         t2= B;
        if(l1 > l2) {
           for(int i=0;i<l1-l2;i++){
            t1=t1.next;
            }
        }else{
            for(int i=0;i<l2-l1;i++){
            t2=t2.next;
        }
   
    }
     while(t1!=t2){
            if(t1==null || t2==null) return null;
            t1=t1.next;
            t2=t2.next;
        } 
     return t1;
}
}