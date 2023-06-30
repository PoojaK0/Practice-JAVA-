class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0)
                nums[c++]=nums[i];
        }

        while(c<nums.length)
            nums[c++]=0;
    }
}


//
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int curr=0;
        while(i < nums.length && curr<nums.length){

            if(nums[i] != 0 ){
                int temp=nums[i];
                nums[i]=nums[curr];
                nums[curr]=temp;

                curr++;
            }
            i++;
            
            // System.out.println(Arrays.toString(nums));
        }

    }
}
