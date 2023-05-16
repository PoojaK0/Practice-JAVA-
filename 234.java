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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> li = new ArrayList();
        while(head != null){
            li.add(head.val);
            head=head.next;
        }
        

        for(int i=0; i<li.size()/2; i++){
            if(li.get(i) != li.get(li.size()-1-i))
            return false;
        }
        return true;
    }
}
