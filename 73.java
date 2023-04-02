class Solution {
     
    public void setZeroes(int[][] arr) {
        
        int[][] arr1=new int[arr.length][arr[0].length];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==0){

                    for(int a=0; a<arr.length; a++){
                     
                        arr1[a][j]=-1;
                    }

                    for(int a=0; a<arr[0].length; a++){
                 
                        arr1[i][a]=-1;
                    }
                }
                }
            }

            for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++)
            if(arr1[i][j]==-1)
            arr[i][j]=0;
        }
        }
    }
