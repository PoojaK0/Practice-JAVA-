/* 
Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

 

Example 1:

Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
*/


class Solution {
    public boolean closeStrings(String s, String t) {
      
 // if length is not equal, they cannot be close
        if(s.length() != t.length())
            return false;
        
        int[] a= new int[26];
        int[] b= new int[26];
      
        // storing the frequency of characters in both strings
        for(int i=0; i<s.length(); i++){
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
            
        }
        /* check is one string has some char while other dont even have it, so they cannot be close
        as even after performing both operations, that unequal string will still be present in the string,
       as existing chars can be tranformed or swapped. */
        for(int i=0; i<26; i++){
            if(a[i]>0 && b[i]==0)
                return false;
            if(a[i]==0 && b[i]>0)
                return false;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
      
        // if all char have equal no of appearance despite the order
        for(int i=0; i<26; i++){
            if(a[i] != b[i])
                return false;
        }
        
        return true;
    }
}
