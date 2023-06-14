class Solution {
    public void swap(int arr[],int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        int rot=k%nums.length;
        swap(nums,0,nums.length-1-rot);
        swap(nums,nums.length-rot,nums.length-1);
        swap(nums,0,nums.length-1);
    }
}
