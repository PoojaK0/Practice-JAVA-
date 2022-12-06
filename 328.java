/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
*/

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        return head;

        ListNode odd=head;
        ListNode even=head.next;
       // head of even list so that we can connect it later at the end of odd list
        ListNode evenHead=even;
        while(odd.next != null && even.next != null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            even=even.next;
            odd=odd.next;
        }

        odd.next=evenHead;
        return head;
    }
}
