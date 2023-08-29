public static int countingValleys(int steps, String path) {
    // Write your code here
    int ans=0;
    int val=0;
    int prev=0;
    for(char c : path.toCharArray()){
        prev=val;
        if(c=='D'){
            val -=1;
        }else{
            val +=1;
        }
        
        if(prev==-1 && val==0)
        ans++;

    }
    return ans;

}
