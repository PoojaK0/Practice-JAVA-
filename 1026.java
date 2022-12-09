/*
Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.

A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.


Example 1:


Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
Output: 7
Explanation: We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
*/





/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=0;
    private void helper(TreeNode root, int min_v, int max_v)
    {
        max = Math.max(max, Math.abs(min_v-max_v));
        if (root.left != null)
            helper(root.left, Math.min(min_v, root.left.val), Math.max(max_v, root.left.val));
        
        if (root.right != null)
            helper(root.right, Math.min(min_v, root.right.val), Math.max(max_v, root.right.val));
    }

    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return max;
        helper(root, root.val, root.val);
        return max;
    }
}
