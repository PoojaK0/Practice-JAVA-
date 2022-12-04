/*
You are given a 0-indexed integer array nums of length n.

The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.

Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.

Note:

The absolute difference of two numbers is the absolute value of their difference.
The average of n elements is the sum of the n elements divided (integer division) by n.
The average of 0 elements is considered to be 0.
 

Example 1:

Input: nums = [2,5,3,9,5,3]
Output: 3
Explanation:
- The average difference of index 0 is: |2 / 1 - (5 + 3 + 9 + 5 + 3) / 5| = |2 / 1 - 25 / 5| = |2 - 5| = 3.
- The average difference of index 1 is: |(2 + 5) / 2 - (3 + 9 + 5 + 3) / 4| = |7 / 2 - 20 / 4| = |3 - 5| = 2.
- The average difference of index 2 is: |(2 + 5 + 3) / 3 - (9 + 5 + 3) / 3| = |10 / 3 - 17 / 3| = |3 - 5| = 2.
- The average difference of index 3 is: |(2 + 5 + 3 + 9) / 4 - (5 + 3) / 2| = |19 / 4 - 8 / 2| = |4 - 4| = 0.
- The average difference of index 4 is: |(2 + 5 + 3 + 9 + 5) / 5 - 3 / 1| = |24 / 5 - 3 / 1| = |4 - 3| = 1.
- The average difference of index 5 is: |(2 + 5 + 3 + 9 + 5 + 3) / 6 - 0| = |27 / 6 - 0| = |4 - 0| = 4.
The average difference of index 3 is the minimum average difference so return 3.

*/


class Solution {
    public int minimumAverageDifference(int[] nums) {
        long[] arr=new long[nums.length];
        long fs=0;
        long ls=0;
        for(int i : nums)
            ls+=i;
        
        for(int i=0; i<nums.length; i++){
            fs+=nums[i];
            ls-=nums[i];
            long put=0;
          // will throw error in line 47 as ls can't be divided by 0
            if(nums.length-i-1 == 0)
            put=Math.abs((fs/(i+1))-0);
            else
            put=Math.abs((fs/(i+1))-(ls/(arr.length-i-1)));
            arr[i]=put;
        }
                             
        long min=Long.MAX_VALUE;
        int ad=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
            {
                min=arr[i];
                ad=i;
            }
        }
              return ad;
    }
}

//used int before, but the answers were wrong in some test cases where length was larger, so instead, used long.
