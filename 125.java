class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();

        int i=0;
        while(i<s.length())
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                s1.append(Character.toLowerCase(s.charAt(i)));
            i++;
        }

        int j=s.length()-1;
        while(j>=0)
        {
            if(Character.isLetterOrDigit(s.charAt(j)))
                s2.append(Character.toLowerCase(s.charAt(j)));
            j--;
        }

        return s1.toString().equals(s2.toString());
    }
}



//
class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            else if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))){
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) )
                    return false;
                else
                    {i++;
                    j--;}
            }
        }
        return true;
    }
}
