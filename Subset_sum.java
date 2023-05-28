//{ Driver Code Starts
//Initial Template for Java
//recursion
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans=new ArrayList<>();
        func(N,arr,ans,0,0);
        Collections.sort(ans);
        // code here
        return ans;
    }
    void func(int n, ArrayList<Integer> arr,ArrayList<Integer> ans,int c,int sum){
        if(c==n){
            ans.add(sum);
            return;
        }
        func(n,arr,ans,c+1,sum+arr.get(c));
        func(n,arr,ans,c+1,sum);
    }
}
