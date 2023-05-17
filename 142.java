/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> se=new HashSet<>();
        while(head != null){

            if(!se.add(head))
            return head;

            head=head.next;
        }
        return null;
    }
}
