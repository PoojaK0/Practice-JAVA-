class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minL=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;

        while(j<nums.length){
            sum+=nums[j++];
            
            while(sum>=target){
                minL=Math.min(minL,j-i);
                sum-=nums[i++];
            }
        }

        return minL==Integer.MAX_VALUE? 0 : minL;
    }
}
