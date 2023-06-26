class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int max_A=0;

        while(i < j){
            int len=j-i;
            int wid=Math.min(arr[i],arr[j]);
            int area=len*wid;

            max_A=Math.max(max_A,area);

            if(arr[i] < arr[j])
                i++;
            else
                j--;
            }
            return max_A;
    }
}
