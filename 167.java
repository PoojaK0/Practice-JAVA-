class Solution {
    public int[] twoSum(int[] n, int t) {
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0; i<n.length; i++){
            int val=t-n[i];

                if(map.containsKey(val))
                    return new int[]{map.get(val)+1,i+1};
                else
                    map.put(n[i],i);
            }
        
        return new int[]{-1,-1};
    }
}

//

class Solution {
    public int[] twoSum(int[] n, int t) {
        int i=0;
        int j=n.length-1;

        int sum=n[i]+n[j];
        while(sum != t){
            if(sum<t)
                i++;
            else
                j--;
            
            sum=n[i]+n[j];
        }
        return new int[]{i+1,j+1};
    }
}
