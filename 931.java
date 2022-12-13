/*
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

 

Example 1:


Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum as shown.
Example 2:


Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is shown.
*/


class Solution {
    public int minFallingPathSum(int[][] A) {
        int n=A.length;
        int[][] dp=new int[n][n];
        for (int[] line:dp){
            Arrays.fill(line,Integer.MAX_VALUE); 
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0) dp[i][j]=A[i][j];
                else{
                    dp[i][j]=dp[i-1][j];
                    if(j-1>=0) dp[i][j]=Math.min(dp[i][j],dp[i-1][j-1]);
                    if(j+1<n) dp[i][j]=Math.min(dp[i][j],dp[i-1][j+1]);
                    dp[i][j]+=A[i][j];  
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for (int sum:dp[n-1]){
            min=Math.min(min,sum);
        }
        return min;
    }
}     
