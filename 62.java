class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];
    
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(i==n-1 || j==m-1)
                dp[i][j]=1;
                else{
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }
            }
           
        }
         return dp[0][0];
    }

}

//recursion time limit exceeded
class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths(m,n,0,0);
    }
    int uniquePaths(int m, int n, int i, int j) {
        if(i >= m || j >= n) return 0;                                
        if(i == m-1 && j == n-1) return 1;                            
        return uniquePaths(m, n, i+1, j) + uniquePaths(m, n, i, j+1);  
    }
}
