class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i)
            return i;
        }
        return nums.length;
    }
}

//or

class Solution {
    public int missingNumber(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++){
            res=res^i+1;
            res^=nums[i];
        }
        return res;
    }
}
