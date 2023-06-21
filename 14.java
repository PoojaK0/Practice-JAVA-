class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        // sb.add("");
        int i=0;
        while(i<strs[0].length() && i<strs[strs.length-1].length()){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i))
                break;
            else
                sb.append(strs[0].charAt(i));
            i++;
        }
        return sb.toString();
    }
}

//
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       String f= strs[0];
        String l= strs[strs.length-1];
        
        int c=0;
        while(c<f.length()){
            if( f.charAt(c) == l.charAt(c))
                c++;
            else
                break;
        }
        return c==0?"":f.substring(0,c);
    }
}
