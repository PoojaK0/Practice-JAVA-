/*
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right. 

Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false
*/


class Solution {
    public boolean allcap(String s){
        String cap= s.toUpperCase();

        if(s.equals(cap))
            return true;
        return false;
    }
    public boolean allsmall(String s){
        String cap= s.toLowerCase();
        
        if(s.equals(cap))
            return true;
        return false;
    }
    public boolean ch(String s){
        
        int i=1;
        while(i < s.length()){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            return false;
            i++;
        }
        if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
        return true;
        return false;

    }
    public boolean detectCapitalUse(String word) {
        if(allsmall(word) || allcap(word) || ch(word))
        return true;
        return false;
    }
}
