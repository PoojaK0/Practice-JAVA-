class Solution {
    public boolean checkStraightLine(int[][] arr) {
        int x1=arr[0][0];
        int y1=arr[0][1];

        int dy=(arr[1][1]-arr[0][1]);
        int dx=(arr[1][0]-arr[0][0]);

        for(int i=1; i<arr.length; i++){
                int x2=arr[i][0];
                int y2=arr[i][1];

                if((x2-x1)*dy != (y2-y1)*dx)
                return false;
            
        }
        return true;
    }
}


// dy   y2-y1
// __ =  __
// dx   x2-x1
