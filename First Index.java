/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x. 
4. You are required to find the first index at which x occurs in array a.
5. If x exists in array, print the first index where it is found otherwise print -1.
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        arr[i]=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int n, int x){
        // correct but not good
        
//         if(n == arr.length)
//         return -1;
//         int no=firstIndex(arr,n+1,x);
//         if(arr[n] ==x)
//         return n;
//         else
//          return no;
        
        
        // good
        if(n == arr.length)
        return -1;

        if(arr[n] ==x)
        return n;
        else
         return firstIndex(arr,n+1,x);
    }

}
