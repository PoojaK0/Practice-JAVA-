/*You are given a string containing characters  and  only. Your task is to change it into a string such that there are no 
matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

Example

Remove an  at positions  and  to make  in  deletions.
*/

 public static int alternatingCharacters(String s) {
    // Write your code here
        if(s.length()==1)
            return 0;
        
        int ans=0;
        int curr=1;
        int last=0;
        while(curr < s.length()){
            if(s.charAt(curr)==s.charAt(last))
            {
                ans++;
                curr++;
            }else{
                last=curr;
                curr++;
            }
        }
        return ans;
    }
