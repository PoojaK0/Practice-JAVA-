/*
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".

Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
A number x

Output Format
row
col of the location where element is found or "Not Found" if element is not in the matrix
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int  n=sc.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
         
       
        int st=-1;
       int y=0;
       
        while(x > arr[y++][n-1] && y <n)
            st=y;
            
            
            //  System.out.println(st);
        
        int ansr=-1;
        int ansc=-1;
            
        for(int j=0; j<n && st!=-1; j++){
            //  System.out.println(arr[st][j]);
            
            if(x == arr[st][j])
            {
                ansr=st;
                ansc=j;
                break;
                
            }
        }
        
        if(ansr !=-1 && ansc != -1)
        System.out.println(ansr+"\n"+ansc);
        else
        System.out.println("Not Found");
    }

}
