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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ne=new ListNode(-1);
        ListNode head=ne;
        while(l1 != null && l2 != null){
            if(l1.val>l2.val){
                ne.next=l2;
                l2=l2.next;
            }else{
                ne.next=l1;
                l1=l1.next;
            }
            ne=ne.next;
        }


        if(l1 != null)
            ne.next=l1;
        else if(l2!= null)
            ne.next=l2;

        // while(l1 != null){
        //     ne.next=l1;
        //     l1=l1.next;
        // }

        // while(l2 != null){
        //     ne.next=l2;
        //     l2=l2.next;
        // }

        return head.next;
        
    }
}
