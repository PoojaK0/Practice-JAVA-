class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int max=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char c=s.charAt(j);
        
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
                set.add(c);
                max=Math.max(max,set.size());
            
                j++;
        }
        return max;
    }
}
