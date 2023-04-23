class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        int j=0;
        for(int[] n : queries){
            int x=0;
            for(int i=n[0]; i<=n[1]; i++){
                    x^=arr[i];
            }
            ans[j++]=x;
        }
        return ans;
    }

  
  
  //
  class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        int j=0;
      
        for(int i=1; i<arr.length; i++)
            arr[i]^=arr[i-1];
        
      
        for(int [] n: queries){
            if(n[0]==0){
                ans[j++]=arr[n[1]];
            }else{
                ans[j++]=arr[n[1]]^arr[n[0]-1];
            }
        }
      
        return ans;
    }
}
