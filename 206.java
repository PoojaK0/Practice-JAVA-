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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;

        

        ListNode curr=head.next;
        ListNode temp=head.next.next;
        head.next=null;

        while(temp != null){
            curr.next=head;
            head=curr;
            curr=temp;
            temp=temp.next;
        }
        curr.next=head;

        return curr;
    }
}


//
class Solution {
   public ListNode reverseList(ListNode head) {
    /* iterative solution */
   ListNode newhead=null;
       while(head != null){
           ListNode next=head.next;
           head.next=newhead;
           
           //update
           newhead=head;
           head=next;
       }
       return newhead;
}
}
