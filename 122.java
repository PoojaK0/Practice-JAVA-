class Solution {
    public int maxProfit(int[] arr) {
      
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
      
        if(sorted(arr))
        return arr[arr.length-1]-arr[0];

        for(int i=0; i<arr.length-1; i++){
            min=Math.min(min,arr[i]);
            max=Math.max(min,arr[i]);
          
            // if next price is lower than the highest met, we sell the stocks at highest price till now
            if(arr[i+1] < max){
            profit+=max-min;
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            }
            
        }
        //checking last element of array
        if(arr[arr.length-1] >= arr[arr.length-2])
        profit+=arr[arr.length-1]-min;

        return profit;
    }

    public static boolean sorted(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1])
            return false;
    }
    return true;
    }
}
