class Solution {

    public void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
}

public void reverse(int[] A, int i, int j) {
    while(i < j) swap(A, i++, j--);
}

    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;

        int i=-1;
        for( i=nums.length-2; i>=0; i--)
            if(nums[i]<nums[i+1])
                break;
      
        if(i>=0){
              int j=-1;
            for(j=nums.length-1; j>i; j--)
                if(nums[j]>nums[i])
                    break;
                swap(nums,i,j);
            }
            
        reverse(nums,i+1,nums.length-1);
    }
}
