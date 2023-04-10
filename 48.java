class Solution {
    public void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        transpose(matrix);
      
        int s=0; 
        int e=matrix.length-1;
        while(s<e){
            for(int i=0; i<matrix[0].length; i++){
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=temp;
            }
            s++;
            e--;
        }
    }
}
