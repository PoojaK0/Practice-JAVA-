class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
      return nums[nums.length/2];
    }
}

//OR brute
class Solution {
    public void swap(int[] arr, int s, int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    public int majorityElement(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j>0; j--){ //insertion sort
				if(arr[j]<arr[j-1])
					swap(arr,j,j-1);
				else
					break;
			}
		}
        // Arrays.sort(arr);
        
        return arr[arr.length/2];
    }
}
