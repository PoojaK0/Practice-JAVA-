/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
*/

class Solution {
    public boolean wordPattern(String p, String s) {
        String[] arr= s.split(" ");
        Map<Character,String> map = new HashMap<>();

        if(arr.length != p.length())
        return false;

        for(int i=0; i<p.length(); i++){
            if(map.containsKey(p.charAt(i)))
            {
                if( !(map.get(p.charAt(i)).equals(arr[i]))   )  
                    return false;
            }else{
                if(map.containsValue(arr[i]))
                    return false;
                map.put(p.charAt(i),arr[i].trim());
            }
        }
        return true;
    }
}

