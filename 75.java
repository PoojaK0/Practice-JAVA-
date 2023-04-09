//without using library's sort function.
class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
            zero++;
            else if(nums[i]==1)
            one++;
            else
            two++;
        }
        int i=0;
        while(i<zero){
            nums[i]=0;
            i++;
        }
        while(i<(zero+one)){
            nums[i]=1;
            i++;
        }
        while(i<(zero+one+two)){
            nums[i]=2;
            i++;
        }
    }
}


//OR


class Solution {
    public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void sortColors(int[] nums) {
        int zero=0;
        int two=nums.length-1;;
        int curr=0;

        while(curr<=two){
            if(nums[curr] == 0)
            {
                swap(nums,curr,zero);
                zero++;
            }
            if(nums[curr]==2){
                swap(nums,curr,two);
                two--;
            }
            else
            curr++;
        }
       
    }
}
