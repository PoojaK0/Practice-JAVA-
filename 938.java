/*
Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].
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

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
        return 0;
        
        int sum=0;
        if(root.val > low)
        sum+=rangeSumBST(root.left,low,high);
        
        if(root.val < high)
        sum+=rangeSumBST(root.right,low,high);

        if(root.val>=low && root.val <=high)
        sum+=root.val;

        return sum;

    }
}
