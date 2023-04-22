//brute
class Solution {
    public int subarraySum(int[] nums, int p) {
				int n=nums.length;
        int tot=0;
        
			for(int i=0; i<n; i++){
        int sum=0;
				for(int j=i; j<n; j++){
                    sum+=nums[j];
                    if(sum==p)
                    tot++;
				}
			}
			return tot;
    }
}


//
class Solution {
    public int subarraySum(int[] nums, int p) {
			Map<Integer,Integer> map=new HashMap<>();
            int sum=0;
            int count=0;
            for(int i=0; i<nums.length; i++){
                sum+=nums[i];

                if(sum==p)
                count++;

                if(map.containsKey(sum-p))
                count+=map.get(sum-p);

                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            return count;
                
    }
}

