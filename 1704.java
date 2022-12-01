/* 
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 
Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
*/


class Solution {
    public boolean halvesAreAlike(String si) {
        String s=si.toLowerCase();
        
        int[] a1=new int[26];
        int[] a2=new int[26];
        
        for(int i=0; i<s.length(); i++){
            if(i<s.length()/2)
                a1[s.charAt(i)-'a']++;
            else
                a2[s.charAt(i)-'a']++;
        }
        
        if(a1[0]+ a1[4]+ a1[8]+ a1[14]+a1[20] != a2[0]+ a2[4]+ a2[8]+ a2[14]+ a2[20])
           return false;
        
        return true;
            
    }
}

//Another possible solution

class Solution {
    public boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
          c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()-1;
        int a=0;
        int b=0;
        while(i<j){
            if(vowel(s.charAt(i++)))
                a++;
            if(vowel(s.charAt(j--)))
                b++;
            
        }
        return (a==b);
    }
}
