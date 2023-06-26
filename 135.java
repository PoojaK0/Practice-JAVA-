class Solution {
    public int candy(int[] arr) {
        int[] ar= new int[arr.length];
        Arrays.fill(ar,1);
            for(int i=1; i<arr.length; i++){
                if(arr[i]>arr[i-1])
                    ar[i]=ar[i-1]+1;
            }

            for(int i=arr.length-2; i>=0; i--){
                if(arr[i+1] < arr[i])
                    ar[i]=Math.max(ar[i],ar[i+1]+1);

            }

            int sum=0;
            for(int i=0; i<ar.length; i++){
                sum+=ar[i];
                }
            return sum;

        }
    }
