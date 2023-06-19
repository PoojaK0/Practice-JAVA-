class Solution {
    public int lengthOfLastWord(String s) {
      String si=s.trim();
      int i=si.length()-1;
      int len=0;
      while(i>= 0 && si.charAt(i) != ' '){
        len++;
        i--;
      }
      return len;
        
    }
}

//
class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
