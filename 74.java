class Solution {
    public boolean searchMatrix(int[][] arr, int n) {
        int r=-1;

        for(int i=0; i<arr.length; i++)
            if(arr[i][arr[0].length-1] >= n){
                r=i;
                break;
                }
            
        if(r==-1)
        return false;

        for(int j=0; j<arr[0].length; j++)
            if(arr[r][j] == n)
                return true;
            
        
        return false;
    }
}

//brute
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0; i<matrix.length; i++)
            for(int j =0 ;j<matrix[i].length; j++)
                if(matrix[i][j] == target)
                    return true;
            
       return false; 
    }
}
