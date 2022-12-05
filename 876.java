/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s=head,f=head;
        
        while(f != null && f.next != null){
            s=s.next;
            f=f.next.next;
        
        }
        return s;
    }
