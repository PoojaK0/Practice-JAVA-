/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. 
4. For the purpose complete the body of maxOfArray function. Don't change the signature.

Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max
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
        System.out.println(maxOfArray(arr,n-1));
        
    }

    public static int maxOfArray(int[] arr, int n){
        if(n==-1)
        return arr[0];
        
        int no=maxOfArray(arr,n-1);
        if(no > arr[n])
        return no;
        else
        return arr[n];
        
    }

}
