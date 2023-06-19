class Solution {
    public int strStr(String h, String n) {

        for(int i=0; i<=h.length()-n.length(); i++){
             boolean found=true;
            for(int j=0; j<n.length(); j++){
                if(h.charAt(i+j) != n.charAt(j)){
                    found=false;
                break;
                }

            }
            if(found)
            return i;
        }
        return -1;
    }
}



// 
class Solution {
    public int strStr(String s, String t) {
        if(s.length() < t.length()) 
        return -1;

        if(t.length() == 0)
        return -1;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t.charAt(0)){
                if(t.length()+i <= s.length())
                if(s.substring(i,t.length()+i).equals(t))
                return i;
            }
        }
        return -1;
    }
}
