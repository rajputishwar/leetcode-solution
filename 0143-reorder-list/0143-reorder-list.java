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
    public void reorderList(ListNode head) {
       if(head==null || head.next == null){
        return;
       } 


       ListNode p1 = head;
       ListNode p2 = head;

       while(p2!=null && p2.next!=null){
        p1 = p1.next;
        p2 = p2.next.next;
       }

       ListNode prev = null;
       ListNode curr = p1.next;
       p1.next = null;

       while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       } 

       ListNode first = head;
       ListNode second = prev;

       while(second !=null){
        ListNode t1 = first.next;    
        ListNode t2 = second.next;   
        first.next = second;
        second .next = t1;

        

        first = t1;
        second = t2;

       }


          

    }
}