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
