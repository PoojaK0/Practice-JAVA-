class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<> ();
        for(int i=0; i<nums.length; i++){
            if( !set.add(nums[i]))
            return nums[i];
        }
        return 0;
    }
}
//OR
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1])
            return nums[i];
        }
        return 0;
    }
}

//or brute force
class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++)
            if(nums[i]==nums[j])
            return nums[i];
        }
    return 0;
    }
}

//or

 public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }
        return len;
    }
