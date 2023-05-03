/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;
}
}

//we can't delete the node
//so copy tha next node's value to anode and delete the next node
