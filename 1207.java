/* 
Given an array of integers arr, 
return true if the number of occurrences of each value in the array is unique,
or false otherwise.

 
Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
No two values have the same number of occurrences.
 
*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        HashSet<Integer> set=new HashSet<Integer>();
		
        for(int n:arr)
        map.put(n,map.getOrDefault(n,0)+1);
        
        for(Integer i: map.keySet())
        {   if(set.contains(map.get(i)))
				return false;
            set.add(map.get(i));
        }
     return true;
        
    }
	
}
