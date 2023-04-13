//brute-time limit exceeded
class Solution {
    public int global(int[] arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j])
                ans++;
            }
        }
        return ans;
    }
    public int local(int[] arr){
        int ans=0;
        for(int i=0; i<arr.length-1; i++)
            if(arr[i]>arr[i+1])
                ans++;
        return ans;
    }
    public boolean isIdealPermutation(int[] nums) {
        if(global(nums)==local(nums))
        return true;
        else
        return false;
    }
}
