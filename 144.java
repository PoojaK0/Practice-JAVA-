/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]
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
    public static void helper(TreeNode root, List arr){
        if(root == null)
        return;
        
        arr.add(root.val);
        helper(root.left,arr);
        helper(root.right,arr);
    }
  
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> arr=new ArrayList<>();
          helper(root,arr);
          return arr;
        
    }
}
