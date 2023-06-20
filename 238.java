class Solution {
    public int[] productExceptSelf(int[] nums) {
        //left array contains product of all the elements present at the left of that element
        int left[] =new int[nums.length];
        left[0]=1;

        for(int i=1; i<nums.length; i++){
            left[i]=left[i-1]*nums[i-1];
        }

        //right array contains product of all the elements present at the right of that element
        int right[] =new int[nums.length];
        right[nums.length-1]=1;

        for(int i=nums.length-2; i>=0; i--){
            right[i]=right[i+1]*nums[i+1];
        }

        int[] product=new int[nums.length];
        for(int i=0; i<nums.length; i++)
            product[i]=left[i]*right[i];

        return product;


    }
}
