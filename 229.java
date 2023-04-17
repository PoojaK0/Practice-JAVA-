class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        List<Integer> list= new ArrayList<>();

        for(int i=0; i<nums.length; i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        int t=nums.length/3;

        for(Map.Entry<Integer,Integer> m : map.entrySet())    //   for(int s:map.keySet())
           if(m.getValue() > t)                              //       if(map.get(s)>(nums.length/3))
            list.add(m.getKey());                           //           list.add(s);

        return list;
    
  }
}

