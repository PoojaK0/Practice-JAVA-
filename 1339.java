/*
Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.

Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.

Note that you need to maximize the answer before taking the mod and not after taking it.

Example 1:

Input: root = [1,2,3,4,5,6]
Output: 110
Explanation: Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11*10)
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
     static int MOD = 1000000007;
    public int maxProduct(TreeNode root) {
    List<Long> li= new ArrayList<>();
    long total=helper(root,li);
    long max = 0;
    for(long s : li){
        long p = s * (total - s);
        max = Math.max(max, p);
    }
    return (int)(max % MOD);
    }

    public long helper(TreeNode root, List<Long> li){
        if(root == null) return 0;
        long left=helper(root.left,li);
        long right=helper(root.right,li);
        long sum=left+right+root.val;
        li.add(sum);
        return sum;
    }
}
