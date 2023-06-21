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
