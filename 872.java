/*
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.


Example 1:

Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true


Example 2:

Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
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
    public void fir(TreeNode root,List<Integer> li){
        if(root==null)
        return;

        if(root.left==null && root.right==null){
         li.add(root.val);
         return ;
         }

        fir(root.left,li);
        fir(root.right,li);;
         
    }
  
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> f=new ArrayList<>();
        List<Integer> s=new ArrayList<>();
      
        fir(root1,f);
        fir(root2,s);
        return f.equals(s);
         
    }
}
